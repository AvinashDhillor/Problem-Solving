import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() {
        // solution code

        double d = 1.0/0.0;
        print(d);
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
