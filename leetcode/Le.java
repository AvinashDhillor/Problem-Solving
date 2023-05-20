import java.util.Arrays;

public class Le {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 6, 7 };
        int target = 12;

        Arrays.sort(arr);

        long mod = (int) 1e9 + 7;

        long count = 0;

        int l = 0, r = arr.length - 1;

        while (l <= r) {
            if (arr[l] + arr[r] <= target) {
                long tot = calc(r - l);
                count += tot;
                count %= mod;
                l++;
            } else {
                r--;
            }
        }

        System.out.println(count);
    }

    private static long calc(long i) {
        return (((i) * (i - 1)) / 2) + (i + 1);
    }
}
