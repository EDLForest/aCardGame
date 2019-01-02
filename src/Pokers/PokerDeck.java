package Pokers;

import base.Card;
import base.Deck;

import java.util.EnumSet;

public class PokerDeck extends Deck<PokerCard> {

    public PokerDeck(boolean includeJoker){
        super();
        //Iterate through all the suits, including Joker
        EnumSet.allOf(Suit.class).forEach((Suit suit) -> {
            if (suit == Suit.JOKER){
                //If Joker is wanted in the Deck
                //Add two Jokers to the Deck, else do nothing
                if(includeJoker){
                    shuffleIntoDeck(new PokerCard(suit, CardValue.JOKER));
                    shuffleIntoDeck(new PokerCard(suit, CardValue.JOKER));
                }
            } else {
                EnumSet.allOf(CardValue.class).forEach((CardValue cardValue) -> {
                    if (cardValue == CardValue.JOKER) return;
                    PokerCard newCard = new PokerCard(suit, cardValue);
                    shuffleIntoDeck(newCard);
                });
            }
        });
    }

    public static void main(String args[]) {
        PokerDeck aPokerDeck = new PokerDeck(true);
        System.out.println(aPokerDeck.toString());
    }
}
