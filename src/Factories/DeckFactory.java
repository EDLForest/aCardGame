package Factories;

import Pokers.*;

import java.util.EnumSet;

public class DeckFactory {


    public static PokerDeck GET_POKER_DECK_EMPTY() {
        return new PokerDeck();
    }

    public static PokerDeck GET_POKER_DECK_NO_JOKER() {
        PokerDeck newDeck = GET_POKER_DECK_EMPTY();
        EnumSet.allOf(Suit.class).forEach((Suit suit) -> {
            if (suit == Suit.JOKER) return;
            EnumSet.allOf(CardValue.class).forEach((CardValue cardValue) -> {
                if (cardValue == CardValue.JOKER) return;
                newDeck.shuffleIntoDeck(CardFactory.GET_POKER_CARD(suit, cardValue));
            });
        });
        return newDeck;
    }

    public static PokerDeck GET_POKER_DECK_WITH_JOKER() {
        PokerDeck newDeck = GET_POKER_DECK_NO_JOKER();
        newDeck.shuffleIntoDeck(CardFactory.GET_POKER_CARD(Suit.JOKER, CardValue.JOKER));
        newDeck.shuffleIntoDeck(CardFactory.GET_POKER_CARD(Suit.JOKER, CardValue.JOKER));
        return newDeck;
    }

}
