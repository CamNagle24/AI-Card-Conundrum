import student.Card;
import student.*;

/**
 * Some basic tets of the Hand class.
 */
public class HandTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand(deck, 7);
        System.out.println(hand.getSize());              // should print 7
        System.out.println(deck.cardsRemaining());       // should print 45

        hand = new Hand(deck, 4);
        System.out.println(hand.getSize());              // should print 4
        System.out.println(deck.cardsRemaining());       // should print 41


        hand = new Hand(deck, 2);
        System.out.println(hand.getSize());              // should print 2
        System.out.println(deck.cardsRemaining());       // should print 39
        System.out.println("card 0 = " + hand.get(0));   // should print a random card
        System.out.println("card 1 = " + hand.get(1));   // should print a different random card


        Card c1 = hand.get(0);
        Card c2 = hand.get(1);

        // and "out of range" cards -- these should all just be c1
        // it should also print an error
        Card cn3 = hand.get(-3);                         // should print Invalid hand index!
        Card c4 = hand.get(4);                           // should print Invalid hand index!
        System.out.println(c1 == cn3);                   // should print true
        System.out.println(c1 == c4);                    // should print true


        Card notIn = deck.draw();
        System.out.println(hand.remove(notIn));          // should print false

        System.out.println(hand.get(0).equals(c1));      // should print true
        System.out.println(hand.get(1).equals(c2));      // should print true

        System.out.println(hand.remove(c1));             // should print true
        System.out.println(c1.equals(hand.get(0)));      // should print false
        System.out.println(c2.equals(hand.get(0)));      // should print false
        System.out.println(hand.get(0));                 // sohuld print a random card different than before.
    }
}
// expected output:
/*
7
45
4
41
2
39
card 0 = <Random Card>
card 1 = <Random Card>
Invalid hand index!
Invalid hand index!
true
true
false
true
true
true
false
false
<Random Card>
 */