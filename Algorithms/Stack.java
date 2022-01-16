import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class Stack<Item> implements Iterable<Item> {
    private class Node {
        Item value;
        Node next;
    }

    private Node head;

    public Item push(Item item) {
        Node oldNode = head;
        head = new Node();
        head.value = item;
        head.next = oldNode;
        return item;
    }

    public Item pop() {
        if (head == null)
            return null;
        Item item = head.value;
        head = head.next;
        return item;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Iterator<Item> iterator() {
        return new ListItems();
    }

    private class ListItems implements Iterator<Item> {
        private Node current = head;

        public void remove() {

        }

        public Item next() {
            Item item = current.value;
            current = current.next;
            return item;
        }

        public boolean hasNext() {
            return current != null;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            stack.push(a);
        }

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
