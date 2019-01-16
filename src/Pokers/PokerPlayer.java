package Pokers;

import Factories.DeckFactory;
import base.Player;

import java.util.ArrayList;

public class PokerPlayer extends Player<PokerCard> {


    public PokerPlayer(){
        playerHand = DeckFactory.GET_POKER_DECK_EMPTY();
    }

    @Override
    public void addCardToHand(PokerCard card) {
        playerHand.shuffleIntoDeck(card);
    }

    @Override
    public void addCardListToHand(ArrayList<PokerCard> cardList) {
        playerHand.shuffleIntoDeck(cardList);
    }


}
