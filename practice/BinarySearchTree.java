import java.util.*;

public class BinarySearchTree {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    private static class Tree {
        private class Node {
            private int val;
            private Node left, right;

            Node(int val) {
                this.val = val;
                left = null;
                right = null;
            }
        }

        private Node head;

        public Tree() {
            head = null;
        }

        public void add(int val) {
            head = add(head, val);
        }

        private Node add(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }
            if (root.val > val) {
                root.left = add(root.left, val);
            } else if (root.val < val) {
                root.right = add(root.right, val);
            }
            return root;
        }

        public void inOrder() {
            inOrderUtil(head);
        }

        private void inOrderUtil(Node root) {
            if (root == null)
                return;
            inOrderUtil(root.left);
            print(root.val + endl);
            inOrderUtil(root.right);
        }
    }

    static void solution() throws Exception {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(35);
        tree.add(42);
        tree.add(232);
        tree.add(1);
        tree.inOrder();
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