import java.util.Arrays;

public class Lis {

    public static int lengthOfLIS(int[] nums) {
        int m = nums.length;
        int[] dp = new int[m + 1];

        for (int i = 0; i < nums.length + 1; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            int n = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    n = Math.max(dp[j], n);
                }
            }
            dp[i] = n + 1;

            System.out.println(Arrays.toString(dp));
        }

        int max = Integer.MIN_VALUE;

        for (int i : dp) {
            max = Math.max(i, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };

        System.out.println(lengthOfLIS(arr));
    }

}
