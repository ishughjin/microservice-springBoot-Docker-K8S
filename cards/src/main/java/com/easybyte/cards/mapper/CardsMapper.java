package com.easybyte.cards.mapper;

import com.easybyte.cards.dto.CardsDto;
import com.easybyte.cards.entity.CardsEntity;

public class CardsMapper {
    public static CardsDto mapToCardDto(CardsEntity card, CardsDto cardsDto) {
        cardsDto.setCardNumber(card.getCardNumber());
        cardsDto.setAmountUsed(card.getAmountUsed());
        cardsDto.setCardType(card.getCardType());
        cardsDto.setTotalLimit(card.getTotalLimit());
        cardsDto.setMobileNumber(card.getMobileNumber());
        cardsDto.setAvailableAmount(card.getAvailableAmount());
        return cardsDto ;
    }

    public static CardsEntity mapToCardEntity(CardsDto cardsDto , CardsEntity cardsEntity) {
        cardsEntity.setCardNumber(cardsDto.getCardNumber());
        cardsEntity.setAmountUsed(cardsDto.getAmountUsed());
        cardsEntity.setCardType(cardsDto.getCardType());
        cardsEntity.setTotalLimit(cardsDto.getTotalLimit());
        cardsEntity.setMobileNumber(cardsDto.getMobileNumber());
        cardsEntity.setAvailableAmount(cardsDto.getAvailableAmount());
        return cardsEntity ;
    }
}
