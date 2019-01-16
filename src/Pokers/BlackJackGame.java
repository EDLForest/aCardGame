package Pokers;

import Factories.DeckFactory;
import base.Game;

public class BlackJackGame extends Game {

    private PokerDeck theDeck = DeckFactory.GET_POKER_DECK_WITH_JOKER();
    private PokerPlayer[] players;

    public BlackJackGame (String gameName, int numberOfPlayer){
        setName(gameName);
        initializePlayers(numberOfPlayer);
    }

    public void startGame(){
        dealCard();

    }

    private void initializePlayers(int numberOfPlayer){
        players = new PokerPlayer[numberOfPlayer];
    }

    @Override
    public void dealCard() {
        for (PokerPlayer player : players){
            player.addCardListToHand(theDeck.drawCards(2));
        }
    }



    public static void main(String args[]) {
        BlackJackGame theGame = new BlackJackGame("testGame", 1);
        theGame.startGame();
    }
}
