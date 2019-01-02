package base;

import java.util.ArrayList;
import java.util.Random;

public class Deck<CardType extends Card> {

    private static Random random = new Random();

    private final int DECK_ID;
    protected ArrayList<CardType> Cards;

    /**
     * The constructor of the Deck superclass will be responsible
     * of generating the identifier of the deck. The initiation
     * and generation of the content of the Deck should be handled
     * by a child class.
     * TODO: Try to do that through the spring frame work.
     */
    public Deck(){
         DECK_ID = 10101010;
         Cards = new ArrayList<>();
    }

    /**
     * This method describes the process of drawing one card from
     * the end of the Deck.
     * @return A Card object if the Deck is not empty
     * @return null is the Deck is empty
     */
    public CardType drawCard(){
        if (Cards.isEmpty()) {
            return null;
        } else {
            return Cards.remove(Cards.size()-1);
        }
    }

    /**
     * This method describes the process of drawing multiple cards
     * from the end of the Deck. the cards drew will be returned as
     * an ArrayList of Card objects. If the Deck ran out of cards
     * during the draw, then return the cards that are drawn so far.
     * @param cardNumber The numbers of cards to draw from the Deck
     * @return ArrayList of Card object of size cardNumber if there
     *          is sufficient numbers of cards in the Deck
     *
     * @return ArrayList of Card object of the size of the Deck if
     *          the size of the Deck is smaller than cardNumber
     */
    public ArrayList<CardType> drawCards(int cardNumber){
        ArrayList<CardType> cardsDrew = new ArrayList<CardType>();
        for (int i = 0; i < cardNumber; i++){
            if (Cards.isEmpty()){ break; }
            else { cardsDrew.add(Cards.remove(Cards.size()-1)); }
        }
        return cardsDrew;
    }

    /**
     * This Method describes the process of shuffling the deck
     * The method starts at the end of the Deck and swap the
     * card with a randomly selected card in the Deck.
     */
    public void shuffle() {
        if (Cards.isEmpty()){
            return;
        }

        for (int sourcePos = Cards.size()-1; sourcePos > 0; sourcePos--){
            //generate target position with bound 0<=destinationPos<=sourcePos
            int destinationPos = random.nextInt(sourcePos+1);

            CardType swappedCard = Cards.remove(destinationPos);
            Cards.add(destinationPos, Cards.remove(sourcePos));
            Cards.add(sourcePos, swappedCard);
        }
    }

    /**
     * This method describe the process of shuffling a card into the
     * deck, the method insert the given card and insert it in a random
     * position in the Deck
     * @param card The Card object that is to be shuffled into the Deck
     */
    public void shuffleIntoDeck(CardType card){
        if (Cards.isEmpty()){
            Cards.add(card);
            return;
        }
        Cards.add(random.nextInt(Cards.size()), card);
    }

    /**
     * This method shuffles an arrayList of cards into the Deck
     * @param cardsToBeInserted The ArrayList of Card to be shuffled
     *                          into the Deck
     */
    public void suffleIntoDeck(ArrayList<CardType> cardsToBeInserted){
        if (cardsToBeInserted.isEmpty()) {
            return;
        }
        if(Cards.isEmpty()) {
            Cards.add(cardsToBeInserted.get(0));
        }
        for(CardType card : cardsToBeInserted){
            Cards.add(random.nextInt(Cards.size()), card);
        }
    }

    public int getNumOfCards(){
        return Cards.size();
    }

    public String toString() {
        StringBuilder deckStringBuilder = new StringBuilder();
        deckStringBuilder.append("Deck ID: " + DECK_ID + "\n");
        deckStringBuilder.append("There are " + getNumOfCards() + " cards:\n");
        for (Card card : Cards){
            deckStringBuilder.append(card.toString() + "\n");
        }
        return deckStringBuilder.toString();
    }
}
