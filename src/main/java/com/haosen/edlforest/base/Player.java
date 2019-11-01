package edlforest.base;

import java.util.ArrayList;

public abstract class Player<CardType extends Card> {

    private String playerName;
    protected Deck<CardType> playerHand;

    public void addCardToHand(CardType card){
        playerHand.shuffleIntoDeck(card);
    }

    public void addCardListToHand(ArrayList<CardType> cardList){
        playerHand.shuffleIntoDeck(cardList);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
