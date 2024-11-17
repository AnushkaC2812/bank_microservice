package com.example.cards.dto;

import lombok.Data;
import org.hibernate.annotations.processing.Pattern;


@Data
public class CardsDto {

    private String mobileNumber;

    private String cardNumber;

    private String cardType;

    private int totalLimit;

    private int amountUsed;

    private int availableAmount;
}
