package com.easybyte.cards.controller;

import com.easybyte.cards.constant.CardConstants;
import com.easybyte.cards.dto.CardsDto;
import com.easybyte.cards.dto.ResponseDto;
import com.easybyte.cards.service.ICardsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 主要用于处理 HTTP 请求，通过将请求映射到相应的处理方法上
@RequestMapping(value = "/api" , produces = {MediaType.APPLICATION_JSON_VALUE})
public class CardsController {
    private ICardsService iCardsService;

    @PostMapping("/test")
    public String testCreateAPi() {
        return "Test" ;
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard (@RequestBody CardsDto cardsDto) {

        iCardsService.createCard(cardsDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ResponseDto(
                        CardConstants.STATUS_201, CardConstants.MSG_201
                )
        );
    }
}
