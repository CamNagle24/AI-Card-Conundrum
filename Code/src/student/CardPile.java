//Cameron Nagle
//This file defines a pile of cards
package student;

public class CardPile {
    /**
     * @param size the number of cards in the pile
     */
    private int size = 0;
    /**
     * @param frontCard the Card that is on top of the pile
     */
    private Card frontCard;

    /**
     * @param topCard puts the Card on top of the pile
     */
    public CardPile(Card topCard) {
        frontCard = topCard;
        size++;
    }

    /**
     * @return the size of the CardPile
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the front card on the pile
     */
    public Card getFrontCard() {
        return frontCard;
    }

    /**
     * @param card the card seeing if it can be played
     * @return true if the Card works to be played in the game or else false
     */
    public boolean canPlay(Card card) {
        if (card == null) {
            return false;
        }
        if (card.getRankNum() > frontCard.getRankNum() || card.getRankNum() == frontCard.getRankNum()
                || card.getSuitName().equals(frontCard.getSuitName())) {
            return true;
        }
        return false;
    }

    /**
     * @param card the card that is trying to be played
     */
    public void play(Card card) {
        if (canPlay(card)) {
            frontCard = card;
            size++;
        } else {
            System.out.println("Illegal move detected!");
        }
    }

    /**
     * @return the number of cards in the pile
     */
    public int getNumCards() {
        return size;
    }

    /**
     * @return the top card in the pile
     */
    public Card getTopCard() {
        return frontCard;
    }

}
