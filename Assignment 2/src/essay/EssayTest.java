package essay;/* Travis Davis
 * Assignment 2 - Essay Class
 *
 * The EssayTest class creates an instance of Essay and setting the point variables with the constructor class.
 * Then it uses a call to the superclass (essay.setScore()) to set the score in the super class so that we can get a letter grade.
 * It prints the score for the essay.
 * It then uses another call to the super class to retrieve and print the letter grade.
 *
 * Thn it uses a mutator method to change the number of points given for grammar, and prints the new grade.
 */

public class EssayTest {
    private static Essay essay;

    public static void main(String[] args) {
        essay = new Essay(20, 15, 18, 30);
        essay.setScore(essay.getEssayScore());

        System.out.println("Score: " + essay.getEssayScore());
        System.out.println("Grade: " + essay.getGrade());

        essay.setGrammarPoints(30);
        essay.setScore(essay.getEssayScore());
        System.out.println("\nWe decided to give you some extra credit for grammar. Here is your new grade: " + essay.getGrade());
    }
}
