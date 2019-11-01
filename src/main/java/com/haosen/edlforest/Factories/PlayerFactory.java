package com.haosen.edlforest.Factories;

import com.haosen.edlforest.base.Player;

public abstract class PlayerFactory {


    public abstract Player makePlayer();
    public abstract Player makePlayer(String playerName);

}
