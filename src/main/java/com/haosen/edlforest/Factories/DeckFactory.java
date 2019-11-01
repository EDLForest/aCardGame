package com.haosen.edlforest.Factories;

import com.haosen.edlforest.PlayingCards.*;
import edlforest.PlayingCards.*;
import com.haosen.edlforest.PlayingCards.BlackJackCardValue;

import java.util.EnumSet;

public class DeckFactory {

    public static PlayingCardDeck GET_PLAYING_CARD_DECK_EMPTY(){
        return new PlayingCardDeck();
    }

    public static BlackJackHand GET_BLACKJACK_HAND(){
        return new BlackJackHand();
    }

    public static PokerHand GET_POKER_HAND(){
        return new PokerHand();
    }

    public static PlayingCardDeck GET_POKER_DECK_NO_JOKER() {
        PlayingCardDeck newDeck = GET_PLAYING_CARD_DECK_EMPTY();
        EnumSet.allOf(Suit.class).forEach((Suit suit) -> {
            EnumSet.allOf(PokerCardValue.class).forEach((PokerCardValue cardValue) -> {
                newDeck.shuffleIntoDeck(CardFactory.GET_POKER_CARD(suit, cardValue));
            });
        });
        return newDeck;
    }

    public static PlayingCardDeck GET_BLACKJACK_DECK_NO_JOKER(){
        PlayingCardDeck newDeck = GET_PLAYING_CARD_DECK_EMPTY();
        EnumSet.allOf(Suit.class).forEach((Suit suit) -> {
            EnumSet.allOf(BlackJackCardValue.class).forEach((BlackJackCardValue cardValue) -> {
                newDeck.shuffleIntoDeck(CardFactory.GET_BLACKJACK_CARD(suit, cardValue));
            });
        });
        return newDeck;
    }

}
