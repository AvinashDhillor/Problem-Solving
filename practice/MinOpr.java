import java.util.*;

public class MinOpr {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for (int i : nums) {
            sum += i;
            pq.add((double) i);
        }

        sum /= 2.0;

        double init = sum;
        int steps = 0;
        while (init > 0) {
            double num = pq.poll();
            double div = num / 2.0;
            pq.add(div);
            init -= div;
            steps++;
        }

        return steps;
    }

    static void solution() throws Exception {
        int[] nums = { 3, 8, 20 };
        print(halveArray(nums));
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