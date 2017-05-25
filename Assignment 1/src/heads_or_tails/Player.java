package heads_or_tails;
/* Travis Davis
 * Assignment 1 - heads_or_tails
 *
 * The Player class uses a random number to determine whether or not the player will guess heads or tails.
 * It also keeps track of the players current score.
 */

import java.util.Random;

public class Player {
    private Random rand;
    private int randomNum;
    private int score = 0;

    public Player() {
        rand = new Random();
    }

    public String getGuess() {
        randomNum = rand.nextInt((2 - 1) + 1) + 1;
        if (randomNum == 1)
            return "heads";
        return "tails";
    }

    public void setScore(int change) {
        score += change;
    }

    public int getScore() {
        return score;
    }
}
