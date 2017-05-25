/**
 * Travis Davis - 5/11/17
 *
 * Tests the MyList class
 */
package mylist;

public class Test {
    private static MyList<Integer> myList = new MyList<Integer>();

    public static void main(String[] args) {

        // add some numbers to mylist
        //
        myList.add(0);
        myList.add(500);
        myList.add(-10);
        myList.add(100);

        // print mylist
        //
        System.out.println("Largest: " + myList.largest());
        System.out.println("Smallest: " + myList.smallest());
    }
}
