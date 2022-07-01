import java.util.*;

public class Pnc {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int t = sc.nextInt();
        for (int ca = 1; ca <= t; ca++) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            sb.append("Case #" + ca + ":" + endl);
            sb.append("..");
            for (int i = 0; i < y - 1; i++) {
                sb.append("+-");
            }
            sb.append("+");
            sb.append(endl);
            sb.append("..");

            for (int i = 0; i < y - 1; i++) {
                sb.append("|.");
            }

            sb.append("|");
            sb.append(endl);

            for (int i = 1; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    sb.append("+-");
                }
                sb.append("+");
                sb.append(endl);
                for (int j = 0; j < y; j++) {
                    sb.append("|.");
                }
                sb.append("|");
                sb.append(endl);
            }

            for (int i = 0; i < y; i++) {
                sb.append("+-");
            }
            sb.append("+");
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