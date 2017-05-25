/**
 * Travis Davis - 5/23/17
 */
package linked_list_backwards;

import java.util.LinkedList;

public class LinkedListTest {
    private static LinkedList linkedList;

    public static void main(String[] args) {
        linkedList = new LinkedList();
        String[] people = {"Bob", "Jim", "James", "Zoe"};
        makeList(people);
        System.out.println(linkedList);
    }

    public static void makeList(String[] names){
        for (String name : names) {
            linkedList.addFirst(name);
        }
    }
}
