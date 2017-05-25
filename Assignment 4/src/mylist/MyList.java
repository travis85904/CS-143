/**
 * Travis Davis - 5/11/17
 *
 * This class lets the user create a list with a type of the Number class.
 *
 * There are methods to add a number, return the greast number, and return the smallest number.
 */
package mylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<T extends Number> {
    private ArrayList<T> arrayList = new ArrayList<T>();

    //Accepts a number as an argument to add to the ArrayList
    //
    public void add(T t) {
        arrayList.add(t);
    }

    //Finds the largest number in the ArrayList
    //
    public T largest() {
        Iterator<T> it = arrayList.iterator();
        T largest = it.next();

        while (it.hasNext()) {
            T temp = it.next();
            if (temp.doubleValue() > largest.doubleValue()) {
                largest = temp;
            }
        }

        return largest;
    }


    //Finds the smallest number in the ArrayList
    //
    public T smallest(){
        Iterator<T> it = arrayList.iterator();
        T smallest = it.next();

        while (it.hasNext()) {
            T temp = it.next();
            if (temp.doubleValue() < smallest.doubleValue()) {
                smallest = temp;
            }
        }

        return smallest;
    }

    //Steps through the ArrayList, 1 number at a time and prints it to the screen.
    //
    public void iterator() {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            T t = it.next();
            System.out.println(t);
        }
    }
}
