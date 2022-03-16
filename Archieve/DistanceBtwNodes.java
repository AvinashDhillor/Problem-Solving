import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.atomic.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    private static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }

    public static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        print(root.val + " ");
        inorder(root.right);
    }
    
    public static int maxHeight =  Integer.MIN_VALUE;

    public static void height(Node root, int height) {
        if(root == null) {
            maxHeight = Math.max(height, maxHeight);
            return;
        }
        height(root.left, height + 1);
        height(root.right, height + 1);
    }
    
    static void solution() {
        // solution code
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(23);
        root.left.left = new Node(5);
        root.left.right = new Node(9);
        root.left.left.left = new Node(2);
        root.left.left.left.left = new Node(1);
        root.left.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(52);
        root.right.left.right  = new Node(17);
        
        inorder(root);
        print(endl);

        height(root, 0);
        print(maxHeight);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        sb = new StringBuilder();
    
        solution();
        print(sb);

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 

    static double time() {
        return System.nanoTime();
    }

    static void timeDiff(double startTime, double endTime) {
        double divideby = 1e9;
        double diff = (endTime - startTime)/divideby;
        print("\nTime Taken : " + diff + " sec\n");
    }

}

class Pair implements Comparator<Pair>, Comparable<Pair> {
    public int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compare(Pair p1, Pair p2) {
        if(p1.first == p2.first) 
            return p1.second - p2.second;
        return p1.first - p2.first;
    }

    public int compareTo(Pair p1) {
        if(this.first == p1.first)
            return this.second - p1.second;
        return this.first - p1.first;
    }

    public String toString() {
        return "["+first+", "+second+"]";
    }
}

