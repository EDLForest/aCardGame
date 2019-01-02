package Pokers;

import base.Game;
import base.Player;

public class BlackJackGame extends Game {

    private PokerDeck theDeck = new PokerDeck(false);
    Player<PokerDeck>[] players;

    public BlackJackGame (String gameName, int numberOfPlayer){
        setName(gameName);
        players = new Player[numberOfPlayer];
        for(Player<PokerDeck> player : players){

        }
    }
}
