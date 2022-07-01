import java.util.*;

public class TwoDigits {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static int sol(int n) {
        if (n == 0)
            return 2;
        if (n == 1)
            return 4;
        return sol(n - 1) + sol(n - 2);
    }

    static void solution() throws Exception {
        int n = sc.nextInt();
        print(sol(n - 1));
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