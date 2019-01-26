package PlayingCards;

import Factories.DeckFactory;
import Factories.PlayerFactory;
import Factories.PlayingCardPlayerFactory;
import base.Game;

public class BlackJackGame extends Game {

    private PlayerFactory playerFactory = new PlayingCardPlayerFactory();

    private PlayingCardDeck theDeck = DeckFactory.GET_BLACKJACK_DECK_NO_JOKER();
    private PlayingCardPlayer[] players;

    public BlackJackGame (String gameName){
        setName(gameName);

    }

//    public void startGame(){
//        dealCard();
//
//    }

    private void initializePlayers(int numberOfPlayer){
        players = new PlayingCardPlayer[numberOfPlayer];
        for(int i = 0; i < numberOfPlayer; i++){
            players[i] = (PlayingCardPlayer)playerFactory.makePlayer();
        }
    }

    @Override
    public void dealCard() {
        for (PlayingCardPlayer player : players) {
            player.addCardListToHand(theDeck.drawCards(2));
        }
    }

    @Override
    public void playerShowHand() {
        for (PlayingCardPlayer player : players) {
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
