//Cameron Nagle
//This file defines a Card
package student;

public class Card {
    /**
     * @param rankNum the number of the rank of the card
     */
    private int rankNum;
    /**
     * @param suitNum the number of the suit of the card
     */
    private int suitNum;

    /**
     * @param rank the number of the rank of the card
     * @param suit the number of the suit of the card
     */
    public Card(int rank, int suit) {
        if (1 <= rank && rank <= 13) {
            if (1 <= suit && suit <= 4) {
                rankNum = rank;
                suitNum = suit;
            } else {
                System.out.println("Invalid Card");
                rankNum = 1;
                suitNum = 1;
            }
        } else {
            System.out.println("Invalid Card");
            rankNum = 1;
            suitNum = 1;
        }
    }

    /**
     * @return the rank num of the object
     */
    public int getRankNum() {
        return this.rankNum;
    }

    /**
     * @return the rank name in string form
     */
    public String getRankName() {
        if (this.rankNum == 1) {
            return "Ace";
        }
        if (this.rankNum == 2) {
            return "Two";
        }
        if (this.rankNum == 3) {
            return "Three";
        }
        if (this.rankNum == 4) {
            return "Four";
        }
        if (this.rankNum == 5) {
            return "Five";
        }
        if (this.rankNum == 6) {
            return "Six";
        }
        if (this.rankNum == 7) {
            return "Seven";
        }
        if (this.rankNum == 8) {
            return "Eight";
        }
        if (this.rankNum == 9) {
            return "Nine";
        }
        if (this.rankNum == 10) {
            return "Ten";
        }
        if (this.rankNum == 11) {
            return "Jack";
        }
        if (this.rankNum == 12) {
            return "Queen";
        }
        if (this.rankNum == 13) {
            return "King";
        } else {
            return "Error";
        }
    }

    /**
     * @return the suit name in string form
     */
    public String getSuitName() {
        if (this.suitNum == 1) {
            return "Spades";
        }
        if (this.suitNum == 2) {
            return "Hearts";
        }
        if (this.suitNum == 3) {
            return "Clubs";
        }
        if (this.suitNum == 4) {
            return "Diamonds";
        } else {
            return "Error";
        }
    }

    /**
     * @return the sentence with the rank and the suit in a string
     */
    public String toString() {
        return (getRankName() + " of " + getSuitName());
    }

    /**
     * @param obj the object that is looking to see if it equals
     * @return true if the instance of the card is true and the rank and suit number matches else false
     */
    public boolean equals(Object obj) {
        if ((obj instanceof Card) == true) {
            if (((Card) obj).rankNum == this.rankNum) {
                if (((Card) obj).suitNum == this.suitNum) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
