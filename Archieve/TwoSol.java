import java.util.*;
import java.lang.*;
import java.io.*;


public class TwoSol {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
         
        int t = sc.nextInt();
        while(t-- > 0) {
            int a , b , c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int ans = Integer.MIN_VALUE;
            // for(int  i = b; i >= (b / c) * c ; i--) {
            //     ans = Math.max(ans, i / c + i % c);
            //     print(i / c + i % c + endl);
            // }
            if(b % c == 0) {
                b = b - 1;
                 print(b / c + b % c + endl);
            } else {
                for(int  i = b; i >= (b / c) * c ; i--) {
                ans = Math.max(ans, i / c + i % c);
                // print(i / c + i % c + endl);
            }
                        print(ans  + endl); 
            }
            // for(int i = b; i >= a  ; i--) {
            //     ans = Math.max(ans, i / c + i % c);
            //     print(i / c + i % c + endl);
            // } 

            // print(ans  + endl); 
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