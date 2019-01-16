package base;

import java.util.ArrayList;

public abstract class Player<CardType extends Card> {
    protected Deck<CardType> playerHand;

    public abstract void addCardToHand(CardType card);

    public abstract void addCardListToHand(ArrayList<CardType> cardList);

}
