package Pokers;

import base.Card;

public class PokerCard extends Card {
    private Suit suit;
    private CardValue value;

    public PokerCard(Suit suit, CardValue value){
        this.setSuit(suit);
        this.setValue(value);
        super.setName(this.getValue() + " of " + this.getSuit());
    }

    public Pokers.Suit getSuit() {
        return suit;
    }

    public void setSuit(Pokers.Suit suit) {
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }

    public String toString(){
        return this.getName();
    }



}

