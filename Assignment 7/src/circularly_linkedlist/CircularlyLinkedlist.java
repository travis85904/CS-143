/**
 * Travis Davis - 5/30/17
 * <p>
 * The CircularlyLinkedList class is a version of a double linked list where the last
 * nodes next element is the first node, and the first node previous element is the last node.
 */
package circularly_linkedlist;

public class CircularlyLinkedlist {
    //Setting up the Node class
    private class Node {
        String value;
        Node next;
        Node prev;

        //Initialize node value and pointers
        Node(String value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        //Call to the constructor when no pointers are given
        Node(String value) {
            this(value, null, null);
        }
    }

    public Node first;
    public Node last;

    //Initialize and empty list
    public CircularlyLinkedlist() {
        first = null;
        last = null;
    }

    //Check if the list is empty by seeing if a first node exists
    public boolean isEmpty() {
        return first == null;
    }

    //Find the size of the list using a while loop and an accumulator variable. It will stop counting once it
    //reaches the last node
    public int size() {

        if (first == null) return 0;

        Node n = first;
        int count = 0;

        while (n != null && n != last) {
            count += 1;
            n = n.next;
        }
        return count + 1; //add 1 to count for last
    }

    //Add a new node to the end of the list
    public void
    add(String e) {
        if (isEmpty()) {
            first = new Node(e);
            last = first;
        } else {
            Node temp = last;
            last = new Node(e, first, temp);
            temp.next = last;
        }
    }

    //Add a new node at a specified index by iterating through the list until the desired index is reached
    public void add(String e, int index) {
        Node current = first;
        Node next = first.next;

        if (index == 0) {
            Node temp = first;
            first = new Node(e, temp, last);
            temp.prev = first;
        } else if (index == size()) {
            Node temp = last;
            last = new Node(e, first, temp);
            temp.next = last;
        } else {

            for (int i = 0; i < index; i++) {
                current = next;
                next = next.next;
            }

            Node n = new Node(e, current, current.prev);
            current.prev.next = n;
            current.prev = n;
        }
    }

    //Remove a node at a specified index by iterating through the list until the desired index is reached
    public String remove(int index) {

        if (index == 0) {
            first = first.next;
            return first.value;
        }

        if (index == size() - 1) {
            last = last.prev;
            return last.value;
        }

        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node next = current.next;
        Node prev = current.prev;

        prev.next = next;
        next.prev = prev;

        return current.value;
    }

    //Remove a node which contains a specific String value by iterating through the list until the node with the
    //specified string is found
    public boolean remove(String e) {
        Node current = first;
        Node next = first.next;

        if (e == first.value) {
            first = first.next;
            first.prev = last;
            return true;
        }
        if (e == last.value) {
            last = last.prev;
            last.next = first;
            return true;
        }

        for (int i = 0; i < size(); i++) {
            if (current.value == e) {
                current.prev.next = next;
                next.prev = current.prev;
                return true;
            }
            current = next;
            next = next.next;
        }

        return false;
    }

    @Override
    //Return all the elements of the list in an easy to read format
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = first;

        for (int i = 0; i < size(); i++) {
            sb.append(n.value + ",");
            n = n.next;
        }

        return sb.toString();
    }

    //Print from index
    public String toString(int index) throws IndexOutOfBoundsException {
        final int SIZE = size();
        StringBuilder sb = new StringBuilder();
        Node n = first;

        if (index >= SIZE) throw new IndexOutOfBoundsException();

        for (int i = 0; i < index; i++) {
            n = n.next;
        }

        for (int i = 0; i < SIZE; i++) {
            sb.append(n.value + "\n");
            n = n.next;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CircularlyLinkedlist cLinkedlist = new CircularlyLinkedlist();

//        cLinkedlist.add("1");
//        cLinkedlist.add("2",0);
//        cLinkedlist.add("3");
//        cLinkedlist.add("4", 2);
//        cLinkedlist.remove(1);
//        cLinkedlist.remove("1");
//        cLinkedlist.add("g", 4);
//        cLinkedlist.remove(0);

        cLinkedlist.add("1");
        cLinkedlist.add("2");
        cLinkedlist.add("3");
        cLinkedlist.add("4");
        cLinkedlist.add("5");
        cLinkedlist.add("6");
        cLinkedlist.add("7");
        cLinkedlist.add("8");
        cLinkedlist.add("9");
        cLinkedlist.add("10");

        System.out.println(cLinkedlist);

        System.out.println("Size: " + cLinkedlist.size());
        System.out.println("First: " + cLinkedlist.first.value);
        System.out.println("Last: " + cLinkedlist.last.value);

        System.out.println(cLinkedlist.toString
                (3));
    }
}
