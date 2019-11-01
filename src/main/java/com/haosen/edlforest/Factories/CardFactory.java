package com.haosen.edlforest.Factories;

import com.haosen.edlforest.PlayingCards.BlackJackCardValue;
import com.haosen.edlforest.PlayingCards.PlayingCard;
import com.haosen.edlforest.PlayingCards.PokerCardValue;
import com.haosen.edlforest.PlayingCards.Suit;
import edlforest.PlayingCards.*;

public class CardFactory {

    public static PlayingCard GET_POKER_CARD(Suit cardSuit, PokerCardValue pokerCardValue){
        return new PlayingCard(cardSuit, pokerCardValue);
    }

    public static PlayingCard GET_BLACKJACK_CARD(Suit cardSuit, BlackJackCardValue blackJackCardValue){
        return new PlayingCard(cardSuit, blackJackCardValue);
    }

}
