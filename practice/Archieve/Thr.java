import java.util.*;

public class Thr {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static int maximumCandies(int[] candies, long k) {
        long sum = Arrays.stream(candies).sum();
        int m = Integer.MAX_VALUE;
        if (sum < k)
            return 0;
        int N = candies.length;

        Arrays.sort(candies);
        int mini;
        if (k < candies.length)
            mini = candies[N - (int) k - 1];
        else
            mini = candies[0];

        int presnt = (int) Math.min((long) candies.length, k);
        for (int i = candies.length - 1; i >= 0; i--) {
            int half1 = i / 2;
            int half2 = (i + 1) / 2;
            if (half1 > mini || presnt < k) {
                mini = half1;
                presnt++;
            }

        }
        return mini;
    }

    static void solution() throws Exception {
        int[] candies = { 4, 7, 5 };
        int k = 4;
        print(maximumCandies(candies, k));
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