import java.util.*;

public class Elgame {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    static int lastRemaining(int n) {
        if(n == 1) return n;
        // find 2 ^ x = n / 2;
        // then find first number which is no divisible by first 2 multiple numbers.
        int evenNumber = n/2; //e.g. 10 / 2  = 2, 4, 5, 8, 10
        int lvl = 0;

        while(evenNumber != 1) {
            evenNumber/=2;
            lvl++;
        }
        System.out.println(lvl);
        return lvl * 2 ;
    }

    static void solution() throws Exception {
        sb.append(lastRemaining(4));
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