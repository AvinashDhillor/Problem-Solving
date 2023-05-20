/**
 * MaxTime
 */
public class MaxTime {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;

        int f = 0;
        for (int i = nums.length - 2; i >= 0 && f != 1; i--) {
            if (nums[i] == 0) {
                int count = 0;
                for (int j = 0; j < i; j++) {
                    if (j + nums[j] <= i)
                        count++;
                    else
                        break;
                }
                if (count == i)
                    f = 1;
            }
        }

        if (f == 1)
            return false;

        return true;

    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 1, 0, 4 };
        int[] nums = { 1, 1, 1, 0 };
        System.out.println(canJump(nums));
    }
}