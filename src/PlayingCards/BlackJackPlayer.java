package PlayingCards;

import Factories.DeckFactory;
import base.Player;

public class BlackJackPlayer extends Player<PlayingCard> {

    public BlackJackPlayer(){
        playerHand = DeckFactory.GET_BLACKJACK_DECK_EMPTY();
    }


    @Override
    public String toString() {
        return "Player's card:\n" +
                playerHand.toString();
    }
}
