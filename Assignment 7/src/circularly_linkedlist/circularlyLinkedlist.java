/**
 * Travis Davis - 5/30/17
 */
package circularly_linkedlist;

public class circularlyLinkedlist {
    private class Node {
        String value;
        Node next;
        Node prev;

        Node(String value, Node next, Node prev) {
            this.value = value;
            this.next = next;
        }

        Node(String value) {
            this(value, null, null);
        }
    }

    private Node first;
    private Node last;

    public circularlyLinkedlist() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
