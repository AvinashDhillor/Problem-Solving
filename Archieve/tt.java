import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    public static int sol(int[] time, int totalTrips) {
        int l = 1; 
        int r = (int)1e6;

        while(l <= r) {
            int mid = (l + r) / 2;
            int sum  = 0;
            for(int i : time) {
                sum += mid / i;
            }
            if(sum == totalTrips) return mid;
            else if(sum > totalTrips) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    public static boolean check(int[] time, int mid, int init) {
            int sum  = 0;
            for(int i : time) {
                sum += mid / i;
            }

            //print(mid + ", " + sum  + endl);
            if(sum == init) return true;

            return false;
    }

    static void solution() throws Exception {
        int[] time  = { 1000};

        int totalTrips = 100000000;
        int ans;
        int tmp = sol(time, totalTrips);
        ans = tmp;
        tmp = tmp - 1;
        if(tmp != -1) {
            while(check(time, tmp, totalTrips)) {
                ans = tmp;
                tmp = tmp - 1;
            }
        }
        print(ans);
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