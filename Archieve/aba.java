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
         int[] a = {34, 67, 89, 67, 34, 34, 98, 33, 18, 90, 56, 11, 34, 33};

         Arrays.sort(a);
    
         Map<Integer, Integer> map  = new TreeMap<>();

         for(int i : a) {
             map.put(i, map.getOrDefault(i, 0) + 1);
         }

         for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
             print(entry.getKey() + " "  + entry.getValue() + endl);
         }

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
    
}