public class Card {
    String suit;
    String rank;
    final static String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};
    final static String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    // public static void main(String[] args) {
    //     Card newCard = new Card("spades", "ace");
    //     System.out.println(newCard.toString());
    // }

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override 
    public String toString() {
        return rank + " of " + suit;
    }
}