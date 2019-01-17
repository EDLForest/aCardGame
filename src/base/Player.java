package base;

import java.util.ArrayList;

public abstract class Player<CardType extends Card> {
    protected Deck<CardType> playerHand;

    public void addCardToHand(CardType card){
        playerHand.shuffleIntoDeck(card);
    }

    public void addCardListToHand(ArrayList<CardType> cardList){
        playerHand.shuffleIntoDeck(cardList);
    }

}
