//Cameron Nagle
//This file gets the smallest valid card in a hand and is an AI
package student;

public class SmallestCardAI extends AI {
    /**
     * @param hand the hand that the person has
     * @param cardPile the pile that you can play on
     * @return the smallest card that can be played or else null
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card smallestRank = new Card(13, 4);
        int canPlay = 0;
        for (int i = 0; i < hand.getSize(); ++i) {
            if (cardPile.canPlay(hand.get(i))) {
                if (hand.get(i).getRankNum() <= smallestRank.getRankNum()) {
                    smallestRank = hand.get(i);
                    canPlay = 1;
                }
            }
        }
        if (canPlay == 1) {
            return smallestRank;
        } else {
            return null;
        }
    }

    /**
     * @return the string Smallest Card AI
     */
    public String toString() {
        return "Smallest Card AI";
    }
}
