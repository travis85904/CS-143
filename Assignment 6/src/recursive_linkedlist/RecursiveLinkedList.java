/**
 * Travis Davis
 * 
 * This is a modified version of LinkedList1. I have added sort() and reverse() methods.
 */
package recursive_linkedlist;

/**
 * The LinkedList1 class implements a Linked list.
 */
@SuppressWarnings("Duplicates")
class RecursiveLinkedList {
    /**
     * The Node class stores a list element
     * and a reference to the next node.
     */
    public void sort() {
        Node current = first;
        Node temp;
        int size = size();

        //check each Node
        for (int i = 0; i < size; i++) {
            Node prev = null;
            current = first;
            Node next = first.next;

            //check current against all the other Nodes
            while (next != null) {

                //Swap the Nodes that are not in alphabetical order
                if (current.value.compareToIgnoreCase(next.value) > 0) {
                    temp = current;
                    current = next;
                    next = temp;
                    next.next = current.next;
                    current.next = next;
                    if (prev != null)
                        prev.next = current;
                    if (prev == null)
                        first = current;

                }

                prev = current;
                current = current.next;
                next = next.next;
            }
        }

            last = current;
            //current.next = null;

    }



    //The reverse() method iterates through the LinkedList and reverses all the next pointers.
    //
    public void reverse() {
        Node pred;
        Node succ;
        Node tempFirst = last;

        for (int i = size() - 1; i > 0; i--) {
            pred = first;

            for (int j = 0; j < i - 1; j++) {
                pred = pred.next;
            }

            succ = pred.next;
            succ.next = pred;
        }
        last = first;
        first = tempFirst;
        last.next = null;
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
    public RecursiveLinkedList() {
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
        RecursiveLinkedList ll = new RecursiveLinkedList();
        ll.add("Jmy");
        ll.add("Bob");
        ll.add(0, "Zl");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        ll.add("A");
        ll.add("a");
        //ll.add(2, "Yami");
        System.out.println("The members of the list are:");
        System.out.print(ll);
        //ll.reverse();
        ll.sort();
        System.out.println("\nSorted:\n" + ll);
        System.out.println("First: "+ll.first.value);
        System.out.println("Last: "+ll.last.value);
        if(ll.last.next==null)
            System.out.println("null");
    }
}