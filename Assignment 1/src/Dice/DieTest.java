package Dice;/*Travis Davis - Assignment 1
 *
 * This program creates 2 instances of the Die class. It then uses the Die.roll() function to roll
 * each die 10 times and keep track of the winner for each roll. In the end it will compare the number
 * of times the computer won and the number of times the user to determine a grand winner.
 */

public class DieTest {
    private static Die computerDie;
    private static Die userDie;
    private static int computerWins;
    private static int userWins;

    public static void main(String[] args) {
        roll();
        printWinner();
    }

    private static void roll() {
        computerDie = new Die(6);
        userDie = new Die(6);
        computerWins = 0;
        userWins = 0;
        for (int i = 0; i < 10; i++) {
            computerDie.roll();
            userDie.roll();
            if (computerDie.getValue() > userDie.getValue()) {
                computerWins += 1;
            } else if (userDie.getValue() > computerDie.getValue()) {
                userWins += 1;
            }
        }
    }

    private static void printWinner() {
        if (computerWins > userWins) {
            System.out.println("The computer won!");
        } else if (userWins > computerWins) {
            System.out.println("The user won!");
        } else if (computerWins == userWins) {
            System.out.println("It was a tie!");
        }
    }
}
