package PlayingCards;

import base.Card;

public class PlayingCard<CardValueType extends IEnumCardValue> extends Card {

    private Suit suit;
    private CardValueType value;

    public PlayingCard(){
        super();
    }

    public PlayingCard(Suit suit, CardValueType value){
        this.setSuit(suit);
        this.setValue(value);
        this.setName(this.getValue() + " of " + this.getSuit());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValueType getValue() {
        return value;
    }

    public void setValue(CardValueType value) {
        this.value = value;
    }

    public int getNumericValue(){
        return value.getNumericValue();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
