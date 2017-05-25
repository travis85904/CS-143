package heads_or_tails;
/* Travis Davis - 4/17/17
 *
 *
 *
 */

import java.util.Random;

public class Coin {
    private Random rand;
    private int randomNum;
    private String sideUp;

    public Coin() {
        rand = new Random();
        toss();
    }

    public void toss() {
        randomNum = rand.nextInt((2 - 1) + 1) + 1;

        if (randomNum == 1) {
            sideUp = "heads";
        } else if (randomNum == 2) {
            sideUp = "tails";
        } else sideUp = "there was a problem in toss()";
    }

    public String getSideUp() {
        return sideUp;
    }
}


