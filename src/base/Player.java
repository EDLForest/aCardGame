package base;

import java.util.ArrayList;

public class Player<HandType extends Deck> {
    HandType playerHand;


    public void addToHand(Card card){
        playerHand.shuffleIntoDeck(card);
    }

}
