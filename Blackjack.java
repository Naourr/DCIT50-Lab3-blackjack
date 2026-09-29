import java.util.Scanner;

public class Blackjack {
    static Deck deck = new Deck();
    static Hand playerHand = new Hand();
    static Hand computerHand = new Hand();

    // public static void main(String[] args) {
    //     System.out.println();
    //     System.out.println(value(new Card("spades", "king")));
    //     playerHand.addCard(new Card("spades", "king"));
    //     playerHand.addCard(new Card("spades", "7"));
    //     System.out.println(handValue(playerHand));
    // }

    static int value(Card card) {
        int result = 0;
        try {
            result = Integer.valueOf(card.rank);
        } catch(Exception e) {
            if (card.rank.equals("ace")) {
                result = 1;
            } else {
                result = 10;
            }
        }
        return result;
    }

    static int handValue(Hand hand){
        int result = 0;
        for (int i=0; i<hand.cards.size(); i++) {
            result += value(hand.cards.get(i));
        }
        return result;
    }
}