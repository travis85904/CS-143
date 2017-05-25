package essay;
/* Travis Davis
 * Assignment 2 - Essay Class
 *
 * The Essay class can use either the contructor class, or the mutator methods to set the points for each portion of the
 * student's grade for an essay.
 * It has the getEssayScore() method to get the total score out of 100.
 */


public class Essay extends GradedActivity {
    private int grammarPoints, spellingPoints, lengthPoints, contentPoints;

    public Essay() {
        grammarPoints = 0;
        spellingPoints = 0;
        lengthPoints = 0;
        contentPoints = 0;
    }

    public Essay(int grammarPoints, int spellingPoints, int lengthPoints, int contentPoints) {
        this.grammarPoints = grammarPoints;
        this.spellingPoints = spellingPoints;
        this.lengthPoints = lengthPoints;
        this.contentPoints = contentPoints;
    }

    public void setGrammarPoints(int grammarPoints) {
        this.grammarPoints = grammarPoints;
    }

    public int getGrammarPoints() {
        return grammarPoints;
    }

    public void setSpellingPoints(int spellingPoints) {
        this.spellingPoints = spellingPoints;
    }

    public int getSpellingPoints() {
        return spellingPoints;
    }

    public void setlengthPoints(int lengthPoints) {
        this.lengthPoints = lengthPoints;
    }

    public int getLengthPoints() {
        return lengthPoints;
    }

    public void setContentPoints(int contentPoints) {
        this.contentPoints = contentPoints;
    }

    public int getEssayScore() {
        return (grammarPoints + spellingPoints + lengthPoints + contentPoints);
    }
}
