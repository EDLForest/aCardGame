package com.haosen.edlforest.playingcard.poker;

import com.haosen.edlforest.playingcard.base.HandValueCalculable;
import com.haosen.edlforest.playingcard.base.PlayingCardDeck;

public class PokerHand extends PlayingCardDeck implements HandValueCalculable {
    
    @Override
    public int getTotalHandValue() {
        return 0;
    }
}
