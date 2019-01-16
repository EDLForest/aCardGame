package Factories;

import Pokers.CardValue;
import Pokers.PokerCard;
import Pokers.Suit;

public class CardFactory {

    public static PokerCard GET_POKER_CARD(Suit cardSuit, CardValue cardValue){
        return new PokerCard(cardSuit, cardValue);
    }
}
