package PlayingCards;

import Factories.DeckFactory;
import Factories.PlayerFactory;
import base.Game;

public class BlackJackGame extends Game {

    private PlayingCardDeck theDeck = DeckFactory.GET_BLACKJACK_DECK_NO_JOKER();
    private BlackJackPlayer[] players;

    public BlackJackGame (String gameName){
        setName(gameName);
    }

//    public void startGame(){
//        dealCard();
//
//    }

    private void initializePlayers(int numberOfPlayer){
        players = new BlackJackPlayer[numberOfPlayer];
        for(int i = 0; i < numberOfPlayer; i++){
            players[i] = PlayerFactory.GET_BLACKJACK_PLAYER();
        }
    }

    @Override
    public void dealCard() {
        for (BlackJackPlayer player : players) {
            player.addCardListToHand(theDeck.drawCards(2));
        }
    }

    @Override
    public void playerShowHand() {
        for (BlackJackPlayer player : players) {
            System.out.println(player.toString());
        }
    }


    public static void main(String args[]) {
        BlackJackGame theGame = new BlackJackGame("testGame");
        theGame.initializePlayers(1);
        theGame.dealCard();
        theGame.playerShowHand();
    }
}
