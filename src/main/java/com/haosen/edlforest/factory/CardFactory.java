package com.haosen.edlforest.factory;

import com.haosen.edlforest.playingcard.blackjack.BlackJackCardValue;
import com.haosen.edlforest.playingcard.base.PlayingCard;
import com.haosen.edlforest.playingcard.poker.PokerCardValue;
import com.haosen.edlforest.playingcard.base.Suit;

public class CardFactory {

    public static PlayingCard GET_POKER_CARD(Suit cardSuit, PokerCardValue pokerCardValue){
        return new PlayingCard(cardSuit, pokerCardValue);
    }

    public static PlayingCard GET_BLACKJACK_CARD(Suit cardSuit, BlackJackCardValue blackJackCardValue){
        return new PlayingCard(cardSuit, blackJackCardValue);
    }

}
