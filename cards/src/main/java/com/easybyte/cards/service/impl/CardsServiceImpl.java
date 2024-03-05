package com.easybyte.cards.service.impl;

import com.easybyte.cards.dto.CardsDto;
import com.easybyte.cards.entity.CardsEntity;
import com.easybyte.cards.mapper.CardsMapper;
import com.easybyte.cards.repository.CardsRepository;
import com.easybyte.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CardsServiceImpl implements ICardsService {
    private CardsRepository cardsRepository ;
    @Override
    public void createCard(CardsDto cardsDto) {
        CardsEntity card = CardsMapper.mapToCardEntity(cardsDto ,new CardsEntity()) ;
        cardsRepository.save(card) ;
    }




}
