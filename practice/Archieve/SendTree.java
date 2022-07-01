public class SendTree {

    private static class Node {
        int val;
        Node left, right;

        public Node(int _val) {
            this.val = _val;
            this.left = null;
            this.right = null;
        }
    }

    private static class Tree {
        private Node root;

        public void insert(int val, int parent) {
            root = this.insert(root, val, parent);
        }

        private Node insert(Node root, int val, int parent) {
            if (root == null) {
                root = new Node(val);
                return root;
            }
            if (root.val == parent) {
                if (root.left == null)
                    root.left = new Node(val);
                else
                    root.right = new Node(val);
            }
            insert(root.left, val, parent);
            insert(root.right, val, parent);
            return root;
        }

        public int findHeight() {
            return findHeight(root);
        }

        private int findHeight(Node root) {
            if (root == null)
                return 0;
            return 1 + Math.max(findHeight(root.left), findHeight(root.right));
        }

        private void printTree() {
            inOrder(root);
        }

        private void inOrder(Node root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1, 1);
        tree.insert(2, 1);
        tree.insert(3, 1);
        tree.insert(4, 3);
        tree.insert(5, 3);

        tree.printTree();

        System.out.println(tree.findHeight());
    }
}
