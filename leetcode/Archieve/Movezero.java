import java.util.Arrays;

public class Movezero {

    public static void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
            } else if (nums[i] != 0) {
                nums[zeroIndex++] = nums[i];
                nums[i] = 0;
            }
            // System.out.println(Arrays.toString(nums));
        }

    }

    public static void main(String[] args) {
        // int[] nums = { 0, 1, 0, 3, 12 };
        int[] nums = { 0 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
