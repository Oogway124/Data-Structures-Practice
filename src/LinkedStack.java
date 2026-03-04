import java.util.NoSuchElementException;

public class LinkedStack <T> {

    private Node head;
    private int n;

    private class Node {
        T item;
        Node next;
    }

    public LinkedStack() {
        head = null;
        n = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void push(T item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = head;
        head = newNode;
        n++;
    }

    public T pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        T item = head.item;
        head = head.next;
        n--;
        return item;
    }

    public T peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.item;
    }
}
