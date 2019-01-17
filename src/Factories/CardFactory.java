package Factories;

import PlayingCards.*;

public class CardFactory {

    public static PlayingCard GET_POKER_CARD(Suit cardSuit, PokerCardValue pokerCardValue){
        return new PlayingCard(cardSuit, pokerCardValue);
    }

    public static PlayingCard GET_BLACKJACK_CARD(Suit cardSuit, BlackJackCardValue blackJackCardValue){
        return new PlayingCard(cardSuit, blackJackCardValue);
    }

}
