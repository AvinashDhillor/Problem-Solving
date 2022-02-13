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

        int[] a = new int[100000000];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (11 - 5) +  5);
        }

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i : a) {
            freq.put(i, freq.getOrDefault(i, 0) + 1 ); 
        }        

       for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
           double percent = ((double)entry.getValue() / (double)a.length) * 100.0;
           percent = Double.valueOf(String.format("%.2f", percent).toString());
           print(entry.getKey() + ", " + entry.getValue() + ", " +percent + endl );
       }
        end();
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
                return "["+first+","+second+"]";
            }
        }
        
    
}