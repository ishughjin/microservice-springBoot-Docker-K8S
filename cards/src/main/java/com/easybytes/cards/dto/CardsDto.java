package com.easybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class CardsDto {
    private String cardNumber ;
    private String mobileNumber ;

    private String cardType;
    private int totalLimit ;
    private int amountUsed;

    private int availableAmount;
}
