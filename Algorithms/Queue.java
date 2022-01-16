import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class Queue<Item> implements Iterable<Item> {

    private class Node {
        Item value;
        Node next;
    }

    private Node head, tail;

    public Item push(Item newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        return newValue;
    }

    public Item pop() {
        if (head == null)
            return null;
        Item a = head.value;
        head = head.next;
        return a;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = head;

        public void remove() {

        }

        public Item next() {
            Item tmp = current.value;
            current = current.next;
            return tmp;
        }

        public boolean hasNext() {
            return current != null;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> stack = new Queue<>();
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            stack.push(a);
        }

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
