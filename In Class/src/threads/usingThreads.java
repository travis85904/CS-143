/**
 * Travis Davis - 5/30/17
 */
package threads;

import java.text.DecimalFormat;

public class usingThreads {
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {"James", "Tim", "Sam"};
        Double seconds = 0.0;
        //DecimalFormat decimalFormat = new DecimalFormat("#.##").format(seconds);
        Thread thread = new Thread();
        thread.start();

        for (int i = 0; i < 1000; i++) {
            //System.out.println(seconds + " seconds...");
            System.out.println(new DecimalFormat("#.0").format(seconds)+" seconds");
            thread.sleep(500);
            seconds += .5;
        }

//        for (String s : importantInfo) {
//            thread.sleep(500);
//            System.out.println(s);
//        }

    }
}
