//Cameron Nagle
//This file does a game and win rate of 2 AIs
package student;
public class UnoWarMatch {
    /**
     * @param aiP1 the AI player 1 will use
     */
    private AI aiP1;
    /**
     * @param aiP2 the AI player 2 will use
     */
    private AI aiP2;

    /**
     * @param ai1 the AI player 1 will use
     * @param ai2 the AI player 2 will use
     */
    public UnoWarMatch(AI ai1, AI ai2) {
        this.aiP1 = ai1;
        this.aiP2 = ai2;
    }

    /**
     * @return true if player 1 wins the game and false if player 2 wins the game
     */
    public boolean playGame() {
        Deck deckUse = new Deck();
        Hand hand1 = new Hand(deckUse, 5);
        Hand hand2 = new Hand(deckUse, 5);
        Card player1Card;
        Card player2Card;
        int player1Wins = 0;
        int player2Wins = 0;
        boolean roundOver;
        boolean player1Turn = true;
        CardPile pile = new CardPile(deckUse.draw());
        while (player1Wins != 10 && player2Wins != 10) {
            roundOver = false;
            while (roundOver != true) {
                if (player1Turn) {
                    player1Card = aiP1.getPlay(hand1, pile);
                    if (player1Card != null) {
                        pile.play(player1Card);
                        hand1.remove(player1Card);
                        player1Turn = false;
                    } else {
                        player2Wins++;
                        roundOver = true;
                        player1Turn = false;
                    }
                } else {
                    player2Card = aiP2.getPlay(hand2, pile);
                    if (player2Card != null) {
                        pile.play(player2Card);
                        hand2.remove(player2Card);
                        player1Turn = true;
                    } else {
                        player1Wins++;
                        roundOver = true;
                        player1Turn = true;
                    }
                }
            }
            if (roundOver) {
                pile = new CardPile(deckUse.draw());
            }
        }
        if (player1Wins == 10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param nTrials the number of trials you want to play
     * @return the number of wins for player 1 as a percentage 0-1
     */
    public double winRate(int nTrials) {
        double player1Wins = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                player1Wins++;
            }
        }
        return player1Wins / (nTrials);

    }
}
