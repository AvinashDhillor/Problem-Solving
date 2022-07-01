import java.util.*;

public class LeCandy {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt(), C = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int tmp = sc.nextInt();
                sum += tmp;
            }
            System.out.println(C >= sum ? "Yes" : "No");
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