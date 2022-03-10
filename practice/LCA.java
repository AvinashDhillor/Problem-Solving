import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    
    static class Tree {
        private class Node {
            int value;
            Node left, right;

            Node (int value) {
                this.value = value;
            }
        }
    
        private Node root; 

        public void insert(int value) {
            Node tmp = root;
            root = insertUtil(tmp, value);
        }

        private int ansNode;

        public boolean lcaUtil(Node root, int a, int b) {
            if(root == null) return false;

            int left = lcaUtil(root.left, a, b) ? 1 : 0;
            int right = lcaUtil(root.right, a, b) ? 1 : 0;

            int mid = (root.value == a || root.value == b) ? 1 : 0;

            if(left + right + mid >= 2) ansNode = root.value;

            return (left  + right + mid) > 0;

        }

        public int lca(int a, int b) {
           lcaUtil(root, a, b);
           return ansNode;
        }
        
        public Node insertUtil(Node root, int value) {
            if(root == null) return new Node(value); 
            if(root.value > value) {
                root.left = insertUtil(root.left, value);    
            } else if (root.value < value) {
                root.right = insertUtil(root.right, value);
            }
            return root;
        }

        public void inOrder() {
            Node tmp = root;
            inOrderUtil(tmp);
        }

        private void inOrderUtil(Node root) {
            if(root == null) return;
            inOrderUtil(root.left);
            print(root.value + " ");
            inOrderUtil(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] a = {10, 23, 52,8, 9, 5, 2 , 7, 15, 17 };

        Tree tree = new Tree();
        
        for(int i : a) {
            tree.insert(i);
        }

        tree.inOrder();
        
        print(endl + tree.lca(15, 52)+ endl);

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

