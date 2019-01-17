package PlayingCards;

import Factories.DeckFactory;
import base.Player;

public class PokerPlayer extends Player<PlayingCard> {


    public PokerPlayer(){
        playerHand = DeckFactory.GET_POKER_DECK_EMPTY();
    }

    @Override
    public String toString() {
        return "Player's card:\n" +
                playerHand.toString();
    }
}
