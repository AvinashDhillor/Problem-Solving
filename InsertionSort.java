import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[] { 10, 32, 45, 22, 52 };

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i : arr) {
            pq.add(i);
        }

        while (!pq.isEmpty()) {
            print(pq.peek() + "\n");
            pq.poll();
        }

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }
}
