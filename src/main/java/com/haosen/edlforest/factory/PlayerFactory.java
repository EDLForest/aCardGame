package com.haosen.edlforest.factory;

import com.haosen.edlforest.base.Player;

public abstract class PlayerFactory {


    public abstract Player makePlayer();
    public abstract Player makePlayer(String playerName);

}
