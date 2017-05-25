package heads_or_tails;
/* Travis Davis 4/17/17
 * Assignment 1 - heads_or_tails
 *
 * This class demonstrates the Coin and Player classes in a game where each player will make a guess of whether the coin will
 * land on heads or tails.
 * If a player guesses correctly, they gain a point. If they guess incorrectly they lose a point.
 * The game will continue until one of the players gets to 5 points.
 */

import java.util.ArrayList;

public class Main {
    private static Coin coin;
    private static Player player;
    private static int currentPlayerIndex, numberOfPlayers;
    private static ArrayList<Player> playerList;

    public static void main(String[] args) {
        coin = new Coin();
        playerList = new ArrayList<>();
        numberOfPlayers = 2;
        makePlayerObjects();
        gameLoop();
    }

    private static void makePlayerObjects() {
        for (int i = 0; i < numberOfPlayers; i++) {
            playerList.add(new Player());
        }
    }

    private static void gameLoop() {
        currentPlayerIndex = -1;
        do {
            nextPlayer();
            player = playerList.get(currentPlayerIndex);
            coin.toss();
            checkGuess();
            System.out.println(player.getScore());
        } while (player.getScore() < 5);

    }

    private static void checkGuess() {
        if (player.getGuess().equalsIgnoreCase(coin.getSideUp()))
            player.setScore(1);
        else
            player.setScore(-1);
    }

    private static void nextPlayer() {
        if (currentPlayerIndex < numberOfPlayers - 1)
            currentPlayerIndex++;
        else
            currentPlayerIndex = 0;
    }
}
