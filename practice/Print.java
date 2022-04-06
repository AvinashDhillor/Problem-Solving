import java.util.*;

public class Print {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int t = sc.nextInt();
        for (int ca = 1; ca <= t; ca++) {
            int[] p1 = new int[4];
            int[] p2 = new int[4];
            int[] p3 = new int[4];
            int[] minC = new int[4];

            for (int i = 0; i < 4; i++) {
                p1[i] = sc.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                p2[i] = sc.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                p3[i] = sc.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                minC[i] = Math.min(p1[i], Math.min(p2[i], p3[i]));
            }

            for (int i = 1; i < 4; i++) {
                minC[i] += minC[i - 1];
            }
            int limit = (int) 1e6;
            sb.append("Case #" + ca + ": ");
            if (minC[3] < limit) {
                sb.append("Impossible");
            } else {
                int prev = 0;
                for (int j = 0; j < 4; j++) {
                    if (limit > 0) {
                        int amo = minC[j] - prev;
                        int ma = Math.min(amo, limit);
                        limit -= ma;
                        sb.append(ma + " ");
                        prev = minC[j];
                    } else
                        sb.append(0 + " ");

                }
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