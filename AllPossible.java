import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    static void BFS(int src, List<List<Integer>> adj) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }

        adj.add(1, (Arrays.asList(new Integer[] { 2, 3 })));
        adj.add(2, Arrays.asList(new Integer[] { 4, 5 }));
        adj.add(3, Arrays.asList(new Integer[] { 6, 8 }));
        adj.add(5, Arrays.asList(new Integer[] { 6 }));

        for (int i = 0; i < 10; i++) {
            print(i + "->");
            for (Integer j : adj.get(i)) {
                print(j + " ");
            }
            print("\n");
        }

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }
}
