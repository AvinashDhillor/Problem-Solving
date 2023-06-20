import java.util.Arrays;
import java.util.Scanner;

/**
 * K_Radius_Subarray_Averages_2090
 */
public class K_Radius_Subarray_Averages_2090 {

    public static int[] getAverages(int[] pre, int k) {
        int n = pre.length - 1;

        long[] nums = new long[pre.length];
        nums[0] = pre[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1] + pre[i];
        }

        var sol = new int[nums.length];

        for (int i = 0; i <= n; i++) {
            if (i >= k && (n - i) >= k) {
                long ele = i - k - 1 < 0 ? 0 : nums[i - k - 1];
                sol[i] = (int) (nums[i] - ele + nums[i + k] - nums[i]);

                System.out.println(sol[i]);

            } else {
                sol[i] = -1;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.replaceAll("(\\[|\\])", "");

        String[] tmp = input.split(",");
        int[] tmp1 = new int[tmp.length];
        for (int i = 0; i < tmp1.length; i++) {
            tmp1[i] = Integer.valueOf(tmp[i]);
        }

        // System.out.println(Arrays.toString(tmp1));

        int k = 40000;

        System.out.println(Arrays.toString(getAverages(tmp1, k)));

        scanner.close();
    }
}