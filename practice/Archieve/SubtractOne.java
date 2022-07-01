import java.util.*;

public class SubtractOne {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node root = null;

    static void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node tmp = new Node(value);
        tmp.next = root;
        root = tmp;
    }

    static void subOne(Node root, int borrow) {
        if (root == null)
            return;
        subOne(root.next, 0);

        if (root.data == 0) {
            root.data = 9;
            borrow = 1;
        } else {
            return;
        }
    }

    static void solution() throws Exception {
        insert(4);
        insert(3);
        insert(2);
        insert(1);
    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        sb = new StringBuilder();

        solution();
        print(sb);

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }

}