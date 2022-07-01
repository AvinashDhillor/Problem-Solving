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

        private int findInorderSucc(Node root) {
            int val = root.val;
            while (root.left != null) {
                val = root.left.val;
                root = root.left;
            }
            return val;
        }

        public Node deleteNode(int key) {
            return head = deleteNode(head, key);
        }

        private Node deleteNode(Node root, int key) {
            if (root == null)
                return null;

            if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                if (root.right == null) {
                    return root.left;
                }
                if (root.left == null) {
                    return root.right;
                }

                int nextInorderSuccessor = findInorderSucc(root.right);
                root.val = nextInorderSuccessor;
                root.right = deleteNode(root.right, nextInorderSuccessor);
            }

            return root;
        }

        public int distanceBetweenNodes(int p, int q) {
            return distanceBetweenNodes(head, p, q);
        }

        private int distancefromroot(Node root, int key) {
            if (root.val == key)
                return 0;
            if (root.val < key)
                return 1 + distancefromroot(root.right, key);
            return 1 + distancefromroot(root.left, key);
        }

        private int distanceBetweenNodes(Node root, int p, int q) {
            if (root == null)
                return 0;

            if (root.val > p && root.val > q) {
                return distanceBetweenNodes(root.left, p, q);
            }
            if (root.val < p && root.val < q) {
                return distanceBetweenNodes(root.right, p, q);
            }
            if (root.val >= p && root.val <= q) {
                return distancefromroot(root, p) + distancefromroot(root, q);
            }
            return 0;
        }
    }

    static void solution() throws Exception {
        Tree tree = new Tree();
        int t = sc.nextInt();
        while (t-- > 0) {
            tree.add(sc.nextInt());
        }

        // tree.inOrder();
        print(tree.distanceBetweenNodes(5, 12));
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