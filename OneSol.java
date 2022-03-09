import java.util.*;
import java.lang.*;
import java.io.*;


public class OneSol {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            String target = sc.next();
            int index = 0;
            boolean flag = false;
            for(String c : s.split("")) {
                if(c.equals(target) && (index % 2  == 0 ) && ((s.length() - 1 - index) % 2 == 0)) {
                    flag = true;
                    break;
                }

                index++;
            }
            print(flag  ? "YES" : "NO" );
            print(endl);
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