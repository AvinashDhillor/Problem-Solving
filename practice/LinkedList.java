public class LinkedList {
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        } else {
            Node tmp = new Node(data);
            tmp.next = root;
            root = tmp;
        }
    }

    public int get(int index) {
        int i = 0;
        Node tmp = root;
        while (tmp.next != null && i < index) {
            i++;
            tmp = root.next;
        }
        return root.data;
    }

    public static void main(String[] args) {

    }
}