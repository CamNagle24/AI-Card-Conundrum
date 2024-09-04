//Cameron Nagle
//This file gets the biggest valid hand in a card and is an AI
package student;

public class BiggestCardAI extends AI {
    /**
     * @param hand the hand that the person has
     * @param cardPile the pile that you can play on
     * @return the biggest card that can be played or else null
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        int canPlay = 0;
        Card biggestRank = new Card(1, 1);
        for (int i = 0; i < hand.getSize(); ++i) {
            if (cardPile.canPlay(hand.get(i))) {
                if (hand.get(i).getRankNum() >= biggestRank.getRankNum()) {
                    biggestRank = hand.get(i);
                    canPlay = 1;
                }
            }
        }
        if (canPlay == 1) {
            return biggestRank;
        } else {
            return null;
        }
    }

    /**
     * @return the string Biggest Card AI
     */
    public String toString() {
        return "Biggest Card AI";
    }
}
