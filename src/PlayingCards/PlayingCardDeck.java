package PlayingCards;

import base.Deck;

public class PlayingCardDeck extends Deck<PlayingCard> {

    public int calculateCardValue(){
        int sum = 0;
        for (PlayingCard card : Cards){
            sum += card.getNumericValue();
        }
        return sum;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
