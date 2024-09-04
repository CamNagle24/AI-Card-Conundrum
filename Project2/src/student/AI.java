//Cameron Nagle
//This file gets the first valid card in a hand and is an AI
package student;

public class AI {
    /**
     * @param hand the hand that the person has
     * @param cardPile the pile that you can play on
     * @return the first play from the hand that is possible or else null
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); ++i) {
            if (cardPile.canPlay(hand.get(i))) {
                return hand.get(i);
            }
        }
        return null;
    }
    /**
     * @return the string Random Card AI
     */
    public String toString() {
        return "Random Card AI";
    }
}
