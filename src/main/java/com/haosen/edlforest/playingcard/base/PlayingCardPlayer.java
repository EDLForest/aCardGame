package com.haosen.edlforest.playingcard.base;

import com.haosen.edlforest.factory.DeckFactory;
import com.haosen.edlforest.base.Player;

public class PlayingCardPlayer extends Player<PlayingCard> {

    public PlayingCardPlayer(){
        new PlayingCardPlayer("No Name");
    }

    public PlayingCardPlayer(String playerName){
        setPlayerName(playerName);
        playerHand = DeckFactory.GET_BLACKJACK_HAND();
    }

    @Override
    public String toString() {
        return this.getPlayerName() +
                "'s Hand:\n" +
                playerHand.toString();

    }
}
