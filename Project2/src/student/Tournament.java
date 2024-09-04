//Cameron Nagle
//This file battles AIs and prints out the win rates
package student;
public class Tournament {
    /**
     * @param args
     * The tournament class runs the AI's and battles them against each other
     */
    public static void main(String[] args) {
        AI randAI = new AI();
        BiggestCardAI bigAI = new BiggestCardAI();
        SmallestCardAI smallAI = new SmallestCardAI();
        UnoWarMatch match1 = new UnoWarMatch(randAI, randAI);
        System.out.println(randAI.toString() + " vs. " + randAI.toString() + " winRate: " + match1.winRate(10000));
        UnoWarMatch match2 = new UnoWarMatch(randAI, smallAI);
        System.out.println(randAI.toString() + " vs. " + smallAI.toString() + " winRate: " + match2.winRate(10000));
        UnoWarMatch match3 = new UnoWarMatch(randAI, bigAI);
        System.out.println(randAI.toString() + " vs. " + bigAI.toString() + " winRate: " + match3.winRate(10000));
        UnoWarMatch match4 = new UnoWarMatch(smallAI, randAI);
        System.out.println(smallAI.toString() + " vs. " + randAI.toString() + " winRate: " + match4.winRate(10000));
        UnoWarMatch match5 = new UnoWarMatch(smallAI, smallAI);
        System.out.println(smallAI.toString() + " vs. " + smallAI.toString() + " winRate: " + match5.winRate(10000));
        UnoWarMatch match6 = new UnoWarMatch(smallAI, bigAI);
        System.out.println(smallAI.toString() + " vs. " + bigAI.toString() + " winRate: " + match6.winRate(10000));
        UnoWarMatch match7 = new UnoWarMatch(bigAI, randAI);
        System.out.println(bigAI.toString() + " vs. " + randAI.toString() + " winRate: " + match7.winRate(10000));
        UnoWarMatch match8 = new UnoWarMatch(bigAI, smallAI);
        System.out.println(bigAI.toString() + " vs. " + smallAI.toString() + " winRate: " + match8.winRate(10000));
        UnoWarMatch match9 = new UnoWarMatch(bigAI, bigAI);
        System.out.println(bigAI.toString() + " vs. " + bigAI.toString() + " winRate: " + match9.winRate(10000));

    }
}
