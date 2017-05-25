package cointoss;
/* Travis Davis - 4/17/17
 * Assignment 1 - cointoss Simulator
 *
 * This program demonstrates the Coin class by making a loop that will toss the coin 20 times, while keeping track
 * of how many times the coin lands on each side.
 * After the loop is complete, it will display how many times the coin landed on each side.
 */

public class CoinTest {
    private static Coin coin;

    public static void main(String[] args) {
        coin = new Coin();
        System.out.println(coin.getSideUp());
        tossLoop();
    }

    public static void tossLoop() {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 20; i++) {
            coin.toss();
            if (coin.getSideUp() == "heads")
                heads += 1;
            else if (coin.getSideUp() == "tails")
                tails += 1;
        }

        System.out.println("\nHeads: " + heads + "\nTails: " + tails);
    }
}

