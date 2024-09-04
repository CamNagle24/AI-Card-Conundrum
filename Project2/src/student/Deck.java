//Cameron Nagle
//This file defines a deck of cards
package student;
import java.util.Random;
public class Deck {
    /**
     * @param deckArray a deck that has 52 values
     */
    private Card[] deckArray = new Card[52];
    /**
     * @param cardsDelt the amount of cards delt
     */
    private int cardsDelt = 52;

    /**
     * constructor that assigns the deck with new cards and shuffles.
     */
    public Deck() {
        int k = 0;
        for (int i = 0; i < 13; ++i) {
            for (int j = 0; j < 4; ++j) {
                Card newCard = new Card(i + 1, j + 1);
                deckArray[k] = newCard;
                k += 1;
            }
        }
        shuffle();
    }
    /**
     * @return the deck array with the cards in it
     */
    public Card[] getDeckArray() {
        return deckArray;
    }

    /**
     * @return the amount of cards left in the deck
     */
    public int getCardsDelt() {
        return cardsDelt;
    }

    /**
     * takes the deck and randomly changes the position of them all.
     */
    public void shuffle() {
        Random rand = new Random();
        Card temp = new Card(1, 1);
        for (int i = 51; i > 1; --i) {
            int j = rand.nextInt(i);
            temp = deckArray[i];
            deckArray[i] = deckArray[j];
            deckArray[j] = temp;
        }
    }

    /**
     * @return the card that is drawn from the deck
     */
    public Card draw() {
        if (isEmpty()) {
            cardsDelt = 52;
            shuffle();
        }
        cardsDelt--;
        return deckArray[cardsDelt];
    }

    /**
     * @return the amount of cards remaining in the deck
     */
    public int cardsRemaining() {
        return cardsDelt;
    }

    /**
     * @return true if the deck is empty and false if it is not
     */
    public boolean isEmpty() {
        if (cardsDelt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
