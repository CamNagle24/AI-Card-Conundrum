import student.Card;
import student.*;

/**
 * This class has some basic tests for the Deck class.
 */
public class CardPileTest {
    public static void main(String[] args) {
        Card c1 = new Card(1, 1);
        Card c2 = new Card(2, 1);
        Card c3 = new Card(1, 2);
        Card c4 = new Card(2, 2);

        CardPile pile = new CardPile(c1);
        System.out.println(pile.getNumCards()); // should print 1
        System.out.println(pile.getTopCard());  // should print "Ace of Spades";
        System.out.println(pile.canPlay(c2));   // should print true
        System.out.println(pile.canPlay(c3));   // should print true
        System.out.println(pile.canPlay(c4));   // should print true

        pile.play(c2);
        System.out.println(pile.getNumCards()); // should print 2
        System.out.println(pile.getTopCard());  // should print "Two of Spades";
        System.out.println(pile.canPlay(c1));   // should print true
        System.out.println(pile.canPlay(c3));   // should print false
        System.out.println(pile.canPlay(c4));   // should print true

        pile.play(c4);
        System.out.println(pile.getNumCards()); // should print 3
        System.out.println(pile.getTopCard());  // should print "Two of Hearts";
        System.out.println(pile.canPlay(c1));   // should print false
        System.out.println(pile.canPlay(c2));   // should print true
        System.out.println(pile.canPlay(c3));   // should print true

        pile.play(c1);                          // should print "Illegal move detected!"
        System.out.println(pile.getNumCards()); // should print 3
        System.out.println(pile.getTopCard());  // should print "Two of Hearts";

        pile.play(null);                        // should print "Illegal move detected!"
        System.out.println(pile.getNumCards()); // should print 3
        System.out.println(pile.getTopCard());  // should print "Two of Hearts";
    }
}
// Expected output
/*
Ace of Spades
true
true
true
2
Two of Spades
true
false
true
3
Two of Hearts
false
true
true
Illegal move detected!
3
Two of Hearts
Illegal move detected!
3
Two of Hearts
 */