package com.haosen.edlforest.factory;

import com.haosen.edlforest.playingcard.base.PlayingCardPlayer;
import com.haosen.edlforest.base.Player;

public class PlayingCardPlayerFactory extends PlayerFactory{

    private int inGamePlayerCount;

    public PlayingCardPlayerFactory(){
        inGamePlayerCount = 0;
    }

    @Override
    public Player makePlayer(){
        inGamePlayerCount++;
        return new PlayingCardPlayer("Player " + inGamePlayerCount);
    }

    @Override
    public Player makePlayer(String playerName) {
        inGamePlayerCount++;
        return new PlayingCardPlayer(playerName);
    }
}
