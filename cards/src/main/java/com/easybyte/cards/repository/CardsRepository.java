package com.easybyte.cards.repository;

import com.easybyte.cards.entity.CardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardsRepository extends JpaRepository<CardsEntity, Long> {
    Optional<CardsEntity> findByCardId(Long cardId) ;
    Optional<CardsEntity> findByMobileNumber(String mobileNumber) ;
}
