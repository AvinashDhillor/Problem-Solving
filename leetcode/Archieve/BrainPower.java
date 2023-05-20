public class BrainPower {

    public static long mostPoints(int[][] questions) {
        long ans = 0;

        long currentMax = Integer.MIN_VALUE;

        long[] dp = new long[questions.length + 1];

        long[] max = new long[questions.length + 1];

        for (int i = questions.length - 1; i >= 0; i--) {
            if (i + questions[i][1] + 1 < questions.length) {
                int next = i + questions[i][1] + 1;
                dp[i] = questions[i][0] + max[next];
            } else {
                dp[i] = questions[i][0];
            }

            currentMax = Math.max(currentMax, dp[i]);
            max[i] = currentMax;

            ans = Math.max(dp[i], ans);
        }
        System.out.println(currentMax);
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 21, 5 }, { 92, 3 }, { 74, 2 }, { 39, 4 }, { 58, 2 }, { 5, 5 }, { 49, 4 }, { 65, 3 } };

        System.out.println(mostPoints(arr));
    }
}
