/**
 * Travis Davis
 * <p>
 * This is a modified version of LinkedList1. I have added sort() and reverse() methods.
 * The sort method sorts the list in alphabetical order.
 * The reverse method puts the list in reverse order.
 */
package recursive_linkedlist;

import java.util.Stack;

@SuppressWarnings("Duplicates")
class RecursiveLinkedlist {
    private Node prev = null;
    private Node current;
    private Node next;
    private Node tempLast;

    public void sort() {

    }

    /**
     * The reverse() method iterates through the LinkedList and reverses all the next pointers.
     */
    public void reverse() {
        Stack stack = new Stack();

        getNext();

    }

    private void getNext() {
        //if(first.next!=null)

    }

    private void setNodes() {
        current = first;
        next = current.next;
    }

    private class Node {
        String value;
        Node next;

        /**
         * Constructor.
         *
         * @param val The element to store in the node.
         * @param n   The reference to the successor node.
         */
        Node(String val, Node n) {
            value = val;
            next = n;
        }

        /**
         * Constructor.
         *
         * @param val The element to store in the node.
         */
        Node(String val) {
            // Call the other (sister) constructor.
            this(val, null);
        }
    }

    private Node first;  // list head
    private Node last;   // last element in list

    /**
     * Constructor.
     */
    public RecursiveLinkedlist() {
        first = null;
        last = null;
    }

    /**
     * The isEmpty method checks to see
     * if the list is empty.
     *
     * @return true if list is empty,
     * false otherwise.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * The size method returns the length of the list.
     *
     * @return The number of elements in the list.
     */
    public int size() {
        int count = 0;
        Node p = first;
        while (p != null) {
            // There is an element at p
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * The add method adds an element to
     * the end of the list.
     *
     * @param e The value to add to the
     *          end of the list.
     */
    public void add(String e) {
        if (isEmpty()) {
            first = new Node(e);
            last = first;
        } else {
            // Add to end of existing list
            last.next = new Node(e);
            last = last.next;
        }
    }

    /**
     * The add method adds an element at a position.
     *
     * @param e     The element to add to the list.
     * @param index The position at which to add
     *              the element.
     * @throws IndexOutOfBoundsException When
     *                                   index is out of bounds.
     */
    public void add(int index, String e) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Index is at least 0
        if (index == 0) {
            // New element goes at beginning
            first = new Node(e, first);
            if (last == null)
                last = first;
            return;
        }

        // Set a reference pred to point to the node that
        // will be the predecessor of the new node
        Node pred = first;
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }

        // Splice in a node containing the new element
        pred.next = new Node(e, pred.next);

        // Is there a new last element ?
        if (pred.next.next == null)
            last = pred.next;
    }

    /**
     * The toString method computes the string
     * representation of the list.
     *
     * @return The string form of the list.
     */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();

        // Use p to walk down the linked list
        Node p = first;
        while (p != null) {
            strBuilder.append(p.value).append("\n");
            p = p.next;
        }
        return strBuilder.toString();
    }

    /**
     * The remove method removes the element at an index.
     *
     * @param index The index of the element to remove.
     * @return The element removed.
     * @throws IndexOutOfBoundsException When index is
     *                                   out of bounds.
     */
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        String element;  // The element to return
        if (index == 0) {
            // Removal of first item in the list
            element = first.value;
            first = first.next;
            if (first == null)
                last = null;
        } else {
            // To remove an element other than the first,
            // find the predecessor of the element to
            // be removed.
            Node pred = first;

            // Move pred forward index - 1 times
            for (int k = 1; k <= index - 1; k++)
                pred = pred.next;

            // Store the value to return
            element = pred.next.value;

            // Route link around the node to be removed
            pred.next = pred.next.next;

            // Check if pred is now last
            if (pred.next == null)
                last = pred;
        }
        return element;
    }

    /**
     * The remove method removes an element.
     *
     * @param element The element to remove.
     * @return true if the remove succeeded,
     * false otherwise.
     */
    public boolean remove(String element) {
        if (isEmpty())
            return false;

        if (element.equals(first.value)) {
            // Removal of first item in the list
            first = first.next;
            if (first == null)
                last = null;
            return true;
        }

        // Find the predecessor of the element to remove
        Node pred = first;
        while (pred.next != null &&
                !pred.next.value.equals(element)) {
            pred = pred.next;
        }

        // pred.next == null OR pred.next.value is element
        if (pred.next == null)
            return false;

        // pred.next.value  is element
        pred.next = pred.next.next;

        // Check if pred is now last
        if (pred.next == null)
            last = pred;

        return true;
    }

    public static void main(String[] args) {
        RecursiveLinkedlist ll = new RecursiveLinkedlist();
        ll.add("Jmy");
        ll.add("Bob");
        ll.add(0, "Zl");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        ll.add("A");
        ll.add("a");
        ll.add("r");
        ll.add("g");
        ll.add("B");
        ll.add("q");
        //ll.add(2, "Yami");
        System.out.println("The members of the list are:");
        System.out.print(ll);
        //ll.reverse();
        ll.sort();
        System.out.println("\nSorted:\n" + ll);
        System.out.println("First: " + ll.first.value);
        System.out.println("Last: " + ll.last.value);
        if (ll.last.next == null)
            System.out.println("null");
    }
}