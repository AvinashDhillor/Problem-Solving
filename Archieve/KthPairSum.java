import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    public static List<List<Integer>> kSmallestPairs(int[] num1, int[] num2, int k) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i : num1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1); 
        }

        for(int i : num2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1); 
        }
        
        for(Map.Entry<Integer, Integer> e : map1.entrySet()) {
            sb.append(e.getKey() + " " + e.getValue() + endl);
        }

        return new ArrayList<>();
    }

    static void solution() {
        // solution code
        int[] a = {1, 7, 11, 10, 11, 7, 1};
        int[] b = {2, 4, 6};

        kSmallestPairs(a, b, 3);
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
    
    static void start() {
        startTime = System.nanoTime();
    }

    static void end() {
        endTime = System.nanoTime();
        timeDiff();
    }

    static void timeDiff() {
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

