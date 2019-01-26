package Factories;

import base.Player;

public abstract class PlayerFactory {


    public abstract Player makePlayer();
    public abstract Player makePlayer(String playerName);

}
