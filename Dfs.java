import java.util.*;
import java.lang.*;
import java.io.*;


public class Dfs {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
        List<Integer> list = new ArrayList<>(Collections.nCopies(3, 10)); 
        list.set(1, 13);
        list.add(3, 14);
        for(int i : list) {
            print(i + " ");
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