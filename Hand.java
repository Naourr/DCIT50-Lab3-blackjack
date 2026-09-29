import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();

    // public static void main(String[] args) {
    //     Hand newHand = new Hand();
    //     newHand.addCard(new Card("hearts", "queen"));
    //     newHand.addCard(new Card("clubs", "queen"));
    //     System.out.println(newHand.toString() + "\n");

    //     newHand.removeCard(new Card("clubs", "queen"));
    //     System.out.println(newHand.toString() + "\n");
    // }

    Hand addCard(Card card) {
        cards.add(card);
        return this;
    }

    Hand removeCard(Card card) {
        cards.remove(this.indexOfCard(card));
        return this;
    }

    int indexOfCard(Card card) {
        for (int i=0; i<cards.size(); i++) {
            if (cards.get(i).suit.equals(card.suit)
                 && cards.get(i).rank.equals(card.rank)) {
                return i;
            }
        }
        return -1;
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