package com.haosen.edlforest.playingcard.poker;

import com.haosen.edlforest.playingcard.base.IEnumCardValue;

public enum PokerCardValue implements IEnumCardValue {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int cardValue;

    PokerCardValue(int value)
    {
        this.cardValue = value;
    }

    @Override
    public int getNumericValue() {
        return cardValue;
    }
}
