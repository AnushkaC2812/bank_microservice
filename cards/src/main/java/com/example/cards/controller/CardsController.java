package com.example.cards.controller;

import com.example.cards.dto.CardsDto;
import com.example.cards.entity.Cards;
import com.example.cards.service.ICardsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class CardsController {
    private ICardsService iCardsService;

    public String createCard(@RequestParam String mobileNumber){
        iCardsService.createCard(mobileNumber);
        return "card created";
    }

    public ResponseEntity<CardsDto> fetchCardDetails(String mobileNumber){
        CardsDto cardsDto = iCardsService.fetchCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(cardsDto);
    }

    public String updateCardDetails(@RequestBody CardsDto cardsDto){
        boolean isUpdated = iCardsService.updateCard(cardsDto);
        if(isUpdated) return "updated";
        else return "not updated";
    }

    public String deleteCardDetails(String mobileNumber){
        boolean isDeleted = iCardsService.deleteCard(mobileNumber);
        if(isDeleted) return "deleted";
        else return "not delete";
    }
}
