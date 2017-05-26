/**
 * The genericDLinkedList class is a generic implementation of the DLinkedList class.
 */
package generic_linkedlist;

@SuppressWarnings("Duplicates")
class GenericDLinkedList<E> {
    //Steps through the list and clears each element
    //
    public void clear() {
        while (first != null) {
            Node n = first.next;
            first = null;
            first = n;
        }
    }

    public E get(int index) {
        Node e = first;
        int count = 0;
        while (count < index) {
            e = e.next;
            count++;
        }
        return e.value;
    }

    public E set(int index, E val) {
        Node pred;
        Node succ = first;
        Node middle = null;
        final int SIZE = size();

        if (index == 0) {
            succ = first;
            middle = new Node(val, succ, null);
            succ.prev = middle;
            first = middle;
        } else if (index == SIZE) {
            pred = last;
            middle = new Node(val, null, pred);
            pred.next = middle;
            last = middle;
        } else
            for (int i = 0; i < index - 1; i++) {
                pred = succ;
                succ = succ.next;
                middle = new Node(val, succ, pred);
                pred.next = middle;
                succ.prev = middle;
            }
        return middle.prev.value;
    }

    private class Node {
        E value;   // Value of a list element
        Node next;      // Next node in the list
        Node prev;      // Previous element in the list

        Node(E val, Node n, Node p) {
            value = val;
            next = n;
            prev = p;
        }

        Node(E val) {
            // Just call the other (sister) constructor
            this(val, null, null);
        }
    }

    private Node first;   // Head of the list
    private Node last;    // Last element on the list

    public GenericDLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

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

    public void add(E e) {
        if (isEmpty()) {
            last = new Node(e);
            first = last;
        } else {
            // Add to end of existing list
            last.next = new Node(e, null, last);
            last = last.next;
        }
    }

    public void add(int index, E e) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Index is at least 0
        if (index == 0) {
            // New element goes at beginning
            Node p = first;            // Old first
            first = new Node(e, p, null);
            if (p != null)
                p.prev = first;
            if (last == null)
                last = first;
            return;
        }

        // pred will point to the predecessor
        // of the new node.
        Node pred = first;
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }

        // Splice in a node with the new element
        // We want to go from  pred-- succ to
        // pred--middle--succ
        Node succ = pred.next;
        Node middle = new Node(e, succ, pred);
        pred.next = middle;
        if (succ == null)
            last = middle;
        else
            succ.prev = middle;
    }

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

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Locate the node targeted for removal
        Node target = first;
        for (int k = 1; k <= index; k++)
            target = target.next;

        E element = target.value;  // Element to return
        Node pred = target.prev;        // Node before the target
        Node succ = target.next;        // Node after the target

        // Route forward and back pointers around
        // the node to be removed
        if (pred == null)
            first = succ;
        else
            pred.next = succ;

        if (succ == null)
            last = pred;
        else
            succ.prev = pred;

        return element;
    }

    public boolean remove(String element) {
        if (isEmpty())
            return false;

        // Locate the node targeted for removal
        Node target = first;
        while (target != null
                && !element.equals(target.value)) {
            target = target.next;
        }

        if (target == null)
            return false;

        Node pred = target.prev;        // Node before the target
        Node succ = target.next;        // Node after the target

        // Route forward and back pointers around
        // the node to be removed
        if (pred == null)
            first = succ;
        else
            pred.next = succ;

        if (succ == null)
            last = pred;
        else
            succ.prev = pred;

        return true;
    }

    public static void main(String[] args) {
        GenericDLinkedList<String> ll = new GenericDLinkedList<>();
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        ll.add(0, "5");
        //ll.clear();
        ll.add("test");
        ll.set(5, "one");
        //System.out.println(ll.get(1));

        System.out.println("The elements of the list are:");
        System.out.println(ll);
    }
}