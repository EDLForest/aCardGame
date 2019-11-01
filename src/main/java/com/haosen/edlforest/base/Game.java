package com.haosen.edlforest.base;

public abstract class Game {
    String name;

//    public Game (String gameName){
//        setName(gameName);
//    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public abstract void dealCard();

    public abstract void playerShowHand();
}
