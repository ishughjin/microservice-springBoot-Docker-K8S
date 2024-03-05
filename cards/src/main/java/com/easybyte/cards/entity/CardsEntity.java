package com.easybyte.cards.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.internal.build.AllowNonPortable;

@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class CardsEntity extends BaseEntity{

    @Id
    @Column(name = "card_id")
    public Long cardId ;

    @Column(name = "mobile_number")
    public String mobileNumber;

    @Column(name = "card_type")
    public String cardType ;

    @Column(name = "total_limit")
    public int totalLimit;

    @Column(name = "card_number")
    public String cardNumber ;

    @Column(name="amount_used")
    public int amountUsed ;

    @Column(name = "available_amount")
    public int availableAmount;

}
