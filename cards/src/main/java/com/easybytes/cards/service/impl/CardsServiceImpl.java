package com.easybytes.cards.service.impl;

import com.easybytes.cards.constant.CardConstants;
import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.entity.CardsEntity;
import com.easybytes.cards.mapper.CardsMapper;
import com.easybytes.cards.repository.CardsRepository;
import com.easybytes.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class CardsServiceImpl implements ICardsService {
    private CardsRepository cardsRepository ;
    @Override
    public void createCard(String mobileNumber) {
        cardsRepository.save(createNewCard(mobileNumber));
    }

    private CardsEntity createNewCard(String mobileNumber) {
        CardsEntity newCard = new CardsEntity( );
        long randomCardNumber = 10000000000L + new Random().nextInt(900000000) ;
        newCard.setCardNumber(Long.toString(randomCardNumber));
        newCard.setMobileNumber(mobileNumber);
        newCard.setCardType(CardConstants.CREDIT_CARD);
        newCard.setTotalLimit(CardConstants.NEW_LIMIT);
        newCard.setAmountUsed(0);
        newCard.setAvailableAmount(0);
        return newCard;
    }

    public CardsDto getCard(String mobileNumber) {
        CardsEntity card = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow(

        );
        return CardsMapper.mapToCardDto(card, new CardsDto());
    }

    public CardsDto updateCard(CardsDto cardsDto) {
        CardsEntity card = cardsRepository.findByCardNumber(cardsDto.getCardNumber()).orElseThrow() ;
        CardsMapper.mapToCardEntity(cardsDto, card) ;
        return cardsDto;
    }

    public boolean deleteCard(String mobileNumber) {
        CardsEntity card = cardsRepository.findByMobileNumber(mobileNumber).orElseThrow() ;

        cardsRepository.deleteById(card.cardId);
        return true;
    }






}
