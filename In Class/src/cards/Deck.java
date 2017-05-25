package cards;

public class Deck {
    private Card[] cards;
    private int topCardIndex = 0;


    public Deck() {

        cards = new Card[52];
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[topCardIndex++] = new Card(rank, suit);
            }
        }
        topCardIndex = 0;
    }

    public Card Deal() {

        return cards[topCardIndex++];
    }

    public void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int j = (int)(Math.random() * cards.length); // Get a random index out of 52
            Card temp = cards[i]; // Swap the cards
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public String toString() {

        String str = "";
        int indx = 0;
        do {
            //System.out.println(randomNum);
            str += cards[indx++].toString() + " ";
            if (indx % 13 == 0) {
                str += "\n";
            }
        } while (indx < 52);
        return str;
    }
}

