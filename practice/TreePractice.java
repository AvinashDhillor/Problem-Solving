public class TreePractice {

    public static class BinarySearchTree {
        private class Node {
            int data;
            Node left, right;

            public Node(int _data) {
                this.data = _data;
                this.left = this.right = null;
            }
        }

        private Node root = null;

        /**
         * Insert elements
         * 
         * @param data
         */
        public void insert(int data) {
            root = insertUtil(root, data);
        }

        private Node insertUtil(Node root, int data) {
            if (root == null)
                return root = new Node(data);

            if (root.data < data) {
                root.right = insertUtil(root.right, data);
            } else if (root.data > data) {
                root.left = insertUtil(root.left, data);
            }
            return root;
        }

        /**
         * Find value
         * 
         * @param val
         * @return
         */
        public boolean find(int val) {
            return find(root, val);
        }

        public boolean find(Node root, int val) {
            if (root == null)
                return false;
            if (root.data > val) {
                return find(root.left, val);
            } else if (root.data < val) {
                return find(root.right, val);
            }
            return true;
        }

        /**
         * Inorder traversal
         */

        public void inorder() {
            inorder(root);
        }

        public void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        /**
         * Delete node from tree
         * 
         * @param val
         */
        public void delete(int val) {
            root = deleteUtil(root, val);
        }

        public Node findInorderSuccess(Node root) {
            Node tmp = root;
            while (tmp.left != null) {
                tmp = tmp.left;
            }

            return tmp;
        }

        public boolean isValid(Node root, long min, long max) {
            if (root == null)
                return true;
            if (root.data < min && root.data > max) {
                return false;
            }

            isValid(root.left, Long.valueOf(root.data - 1), max);
            isValid(root.right, min, Long.valueOf(root.data + 1));
            return true;
        }

        public boolean isValidBST() {
            return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public Node deleteUtil(Node root, int val) {
            if (root == null)
                return null;
            if (root.data < val) {
                root.right = deleteUtil(root.right, val);
            } else if (root.data > val) {
                root.left = deleteUtil(root.left, val);
            } else {
                Node left = root.left;
                Node right = root.right;

                if (left == null && right == null) {
                    return null;
                } else if (left == null) {
                    return root.right;
                } else if (right == null) {
                    return root.left;
                } else {
                    Node inorderSuccessor = findInorderSuccess(root.right);
                    root.data = inorderSuccessor.data;
                    root.right = deleteUtil(root.right, inorderSuccessor.data);
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] bag = { 53, 23, 234, 12, 663, 24 };
        for (int i : bag) {
            tree.insert(i);
        }

        tree.inorder();

        tree.delete(23);
        tree.inorder();
        System.out.println(tree.isValidBST());
    }
}
