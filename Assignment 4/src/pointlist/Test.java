/**
 * Travis Davis - 5/13/17
 *
 * This is a short test of the PointList class.
 * It demonstrates the class by initializing a PointList object with 1 Point object as an argument
 * then calls the add method to add 1 more Point object.
 *
 * Then the PointList object is displayed to the screen.
 */
package pointlist;

import java.awt.*;

public class Test {


    private static PointList pointList = new PointList(new Point(1,3));

    public static void main(String[] args) {
        pointList.add(new Point(-1,1));

        System.out.println(pointList);
    }
}
