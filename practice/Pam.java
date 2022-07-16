import java.util.*;

public class Pam {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() throws Exception {
         int t = sc.nextInt();
         while(t-- > 0) {
            int n = sc.nextInt();
            int l = 1, r = n;
            while(l <= n/2 && r > (n + 1)/2) {
                sb.append(r + " " + l + " ");
                l++;
                r--;
            }
            if(n % 2 != 0) {
                sb.append((n + 1) / 2);
            }
            sb.append(endl);
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