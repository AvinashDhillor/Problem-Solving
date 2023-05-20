/**
 * TestRecu
 */
public class TestRecu {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node old = null;

    static boolean ans = true;

    static boolean recur(Node start) {
        if (start == null)
            return ans &= true;
        recur(start.next);
        int x = start.val;
        int y = old.val;
        old = old.next;
        if (x != y)
            return ans &= false;
        return ans &= true;
    }

    public static void main(String[] args) {
        Node node = new Node(0);
        Node start = node;
        for (int i = 1; i < 5; i++) {
            node.next = new Node(i);
            node = node.next;
        }

        for (int i = 4; i >= 0; i--) {
            node.next = new Node(i);
            node = node.next;
        }

        old = start;

        recur(start);
    }
}