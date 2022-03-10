import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    static int upperbound(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a[mid] <= key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    static int lowerbound(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid ;
            }
        }
        return l;

    }

    static void solution() throws Exception {
       int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 12};
        print(a[upperbound(a, 0)]);
        print(endl);
        print(a[lowerbound(a, 0)] + endl);
        print(a[lowerbound(a, 8)] );
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