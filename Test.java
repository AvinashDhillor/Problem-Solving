import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
        // solution code
        start();
        long n = sc.nextLong();
        long m = sc.nextLong();
        long count = 0;
        for(long i = n; i <= m; i++) {
            count += i;
            if(count > mod) count = count % mod;
        }
        end();
        print(count + endl);
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
         String result = String.format("%.9f", diff);
           print("\nTime Taken : " + result + " sec\n");
    } 
}