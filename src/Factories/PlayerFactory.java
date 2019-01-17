package Factories;

import PlayingCards.BlackJackPlayer;
import PlayingCards.PokerPlayer;

public class PlayerFactory {


    public static PokerPlayer GET_POKER_PLAYER(){
        return new PokerPlayer();
    }

    public static BlackJackPlayer GET_BLACKJACK_PLAYER(){
        return new BlackJackPlayer();
    }
}
