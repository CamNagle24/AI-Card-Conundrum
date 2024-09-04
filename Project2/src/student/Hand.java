//Cameron Nagle
//This file defines a hand of cards
package student;

public class Hand extends Deck {
    /**
     * @param sizeNum the size of the hand
     */
    private int sizeNum = 0;
    /**
     * @param handArray that stores the cards in the hand
     */
    private Card[] handArray;
    /**
     * @param deck the deck of cards that will be used
     */
    private Deck deck;

    /**
     * @param deck the deck that will be used to draw the hand
     * @param size the size of the hand
     */
    public Hand(Deck deck, int size) {
        handArray = new Card[size];
        sizeNum = size;
        this.deck = deck;
        for (int i = 0; i < size; ++i) {
            handArray[i] = deck.draw();
        }
    }

    /**
     * @return the size of the hand
     */
    public int getSize() {
        return sizeNum;
    }

    /**
     * @param i the position on the hand to get
     * @return the card at position i
     */
    public Card get(int i) {
        if (i > getSize() || i < 0) {
            System.out.println("Invalid hand index!");
            return handArray[0];
        }
        return handArray[i];
    }

    /**
     * @param card the card that will be removed from the hand
     * @return trye if it can be removed and replaced or false if it cannot
     */
    public boolean remove(Card card) {
        for (int i = 0; i < getSize(); ++i) {
            if (handArray[i].equals(card)) {
                handArray[i] = this.deck.draw();
                return true;
            }
        }
        return false;
    }

}
