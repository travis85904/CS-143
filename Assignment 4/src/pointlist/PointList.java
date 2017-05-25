/**
 * Travis Davis - 5/12/17
 *
 * The PointList class holds an ArrayList of Point objects.
 * It can also add more Point objects to the ArrayList, and display the ArrayList to the screen.
 */
package pointlist;

import java.awt.*;
import java.util.ArrayList;

public class PointList<T extends Point> {
    private ArrayList<T> pointList = new ArrayList<>();

    public PointList(T point) {
        pointList.add(point);
    }

    //
    // Add a point object to the ArrayList
    public void add(T point) {
        pointList.add(point);
    }

    //
    // Print the ArrayList to the screen
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Point point : pointList) {
            sb.append(point + "\n");
        }

        return sb.toString();
    }
}
