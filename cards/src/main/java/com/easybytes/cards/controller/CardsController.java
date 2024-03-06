package com.easybytes.cards.controller;

import com.easybytes.cards.constant.CardConstants;
import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.dto.ResponseDto;
import com.easybytes.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController // 主要用于处理 HTTP 请求，通过将请求映射到相应的处理方法上
@RequestMapping(value = "/api" , produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CardsController {
    private ICardsService iCardsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard (@RequestParam String mobileNumber) {

        iCardsService.createCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ResponseDto(
                        CardConstants.STATUS_201, CardConstants.MSG_201
                )
        );
    }

    @GetMapping("/fetch")
    public ResponseEntity<CardsDto> getCardDetails(@RequestParam String mobileNumber ){
        CardsDto cardsDto = iCardsService.getCard(mobileNumber) ;
        return ResponseEntity.status(HttpStatus.OK).body(
                cardsDto
        ) ;
    }

    public ResponseEntity<CardsDto> updateCardDetails(@RequestBody CardsDto cardsDto) {
        CardsDto card = iCardsService.updateCard(cardsDto) ;
        return ResponseEntity.status(HttpStatus.OK).body(
                cardsDto
        ) ;
    }


    @DeleteMapping("/delete")
    public boolean deleteCard(@RequestParam String mobileNumber) {
         iCardsService.deleteCard(mobileNumber);
        return true;
    }
}
