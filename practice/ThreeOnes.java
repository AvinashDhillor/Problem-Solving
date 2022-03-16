import java.util.*;

public class ThreeOnes {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int n = sc.nextInt();
        if (n == 1) {
            print(2 + endl);
        } else if (n == 2) {
            print(4 + endl);
        } else if (n == 3) {
            print(7 + endl);
        } else {
            long[] tmp = new long[n + 1];
            tmp[0] = 2;
            tmp[1] = 4;
            tmp[2] = 7;
            long mod = 12345;
            for (int i = 3; i <= n - 1; i++) {
                tmp[i] = ((tmp[i - 1]) % mod + (tmp[i - 2]) % mod + (tmp[i - 3]) % mod) % mod;
            }
            print(tmp[n - 1] + endl);
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