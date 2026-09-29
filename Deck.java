import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    // public static void main(String[] args) {
    //     Deck newDeck = new Deck();
    //     System.out.println(newDeck.shuffle().toString() + "\n");
    //     System.out.println(newDeck.take().toString() + "\n");
    //     System.out.println(newDeck.toString() + "\n");
    //     System.out.println(newDeck.put(new Card("hearts", "queen")).toString() + "\n");
    // }

    Deck() {
        for (int i=0; i<Card.SUITS.length; i++) {
            for (int j=0; j<Card.RANKS.length; j++) {
                Card newCard = new Card(Card.SUITS[i], Card.RANKS[j]);
                cards.add(newCard);
            }
        }
    }

    Deck shuffle() {
        Collections.shuffle(cards);
        return this;
    }

    Card take() {
        return cards.remove(0);
    }

    Deck put(Card card) {
        cards.add(card);
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i=0; i<cards.size(); i++)  {
            if (i==cards.size()-1) {
                result += cards.get(i).toString() + ". ";
            } else {
                result += cards.get(i).toString() + ", ";
            }
        }
        return result;
    }
}