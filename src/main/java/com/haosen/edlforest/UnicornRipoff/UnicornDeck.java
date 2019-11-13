package com.haosen.edlforest.UnicornRipoff;

import com.haosen.edlforest.base.Deck;
import java.util.ArrayList;

public class UnicornDeck extends Deck<UnicornCard> {

    /**
     * This method goes through the Deck and find
     * cards that have the keyword in its name and returns them in an
     * List of Card objects. These cards are NOT removed/draw from the deck.
     * @param keyword the keyword used to search in the name of cards
     * @return returns an ArrayList of Card objects that contain keyword in their name
     */
    public ArrayList<UnicornCard> getCardsWithKeyword(String keyword){
        ArrayList<UnicornCard> cardsDrew = new ArrayList<>();
        for(UnicornCard card: Cards){
            if (card.getName().contains(keyword)){
                cardsDrew.add(card);
            }
        }
        return cardsDrew;
    }

    /**
     * This method goes through the Deck and draw a
     * card that matches the requested name
     * @param name the name of the card to look for
     * @return Card object with name equals to the parameter name
     * @return null if the card with the requested name is not found
     */
    public UnicornCard drawCardWithExactName(String name) {
        for(int i=0; i < Cards.size(); i++){
            if (Cards.get(i).getName().equals(name)) {
                return Cards.remove(i);
            }
        }
        return null;
    }
}
