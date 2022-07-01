import java.util.*;

public class Three {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int t = sc.nextInt();
        for (int ca = 1; ca <= t; ca++) {
            int size = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < size; i++) {
                int tmp = sc.nextInt();
                pq.add(tmp);
            }

            sb.append("Case #" + ca + ": ");

            int num = 0;
            while (!pq.isEmpty()) {
                int ab = pq.poll();
                if (ab > num) {
                    num++;
                }
            }
            sb.append(num);
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