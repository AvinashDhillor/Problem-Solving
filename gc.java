import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static Scanner sc = null;
  
    static long gcd(long a, long b) {
        if(a == 0L) return b;
        if(b == 0L) return a;
        if(a == b) return a;
        if(a > b) return gcd(a - b, b);
        return gcd(a, b-a);
    }

    static void solution() {
        long n, m; 
        n = sc.nextLong();
        m = sc.nextLong();
		long ans = m / n;
        long ans2 = ans + (m % n);
        print(gcd(ans, ans2) + "\n");
    }
  
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        solution();
        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 

    static void lower_bound(int[] a, int key) {
        
    }
}
