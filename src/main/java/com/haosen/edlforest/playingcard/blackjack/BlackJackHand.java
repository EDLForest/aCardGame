package com.haosen.edlforest.playingcard.blackjack;

import com.haosen.edlforest.playingcard.base.HandValueCalculable;
import com.haosen.edlforest.playingcard.base.PlayingCard;
import com.haosen.edlforest.playingcard.base.PlayingCardDeck;

import java.util.ArrayList;

public class BlackJackHand extends PlayingCardDeck implements HandValueCalculable {

    private int totalHandValue = 0;
    private ArrayList<PlayingCard> AceList = new ArrayList<>();

    @Override
    public int getTotalHandValue(){
        calculateDeckValue();
        return totalHandValue;
    }

    private void calculateDeckValue() {
        totalHandValue = 0;
        calculateDeckValueWithoutAce();
        calculateDeckValueWithAce();
    }


    private void calculateDeckValueWithoutAce(){
        for (PlayingCard card : Cards){
            if(card.getValue() == BlackJackCardValue.ACE) {
                AceList.add(card);
                continue;
            }
            totalHandValue += card.getNumericValue();
        }
    }

    private void calculateDeckValueWithAce(){
        if(AceList.isEmpty()) return;

        if(totalHandValue <= 10){
            totalHandValue += (11 + AceList.size()-1);
        } else {
            totalHandValue += AceList.size();
        }
    }

    private boolean isBust(){
        return (totalHandValue > 21);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Total Hand Value: " +
                getTotalHandValue();
    }
}
