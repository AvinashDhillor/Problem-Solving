import java.util.Arrays;

public class LongestObs {

    public static int upperbound(int[] arr, int key, int right) {
        if (right == 0)
            return 0;

        int left = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;

        int dp[] = new int[n];
        int lis[] = new int[n];

        int lisLength = 0;

        for (int i = 0; i < obstacles.length; i++) {
            int height = obstacles[i];

            int idx = upperbound(lis, height, lisLength);

            if (idx == lisLength) {
                lisLength++;
            }

            lis[idx] = height;
            dp[i] = idx + 1;

        }

        return dp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 6, 4, 2 };

        System.out.println(Arrays.toString(longestObstacleCourseAtEachPosition(arr)));
        String s1 = "ad";
        System.out.println(s1.codePointAt(1));
    }
}
