import java.util.Arrays;

public class ColorSort {
    public static void sortColors(int[] nums) {
        int zeroStart = 0;
        int twoStart = nums.length - 1;
        int i = 0;
        while (i < twoStart) {
            if (nums[i] == 0) {
                nums[i] = nums[zeroStart];
                nums[zeroStart++] = 0;

            } else if (nums[i] == 2) {
                nums[i] = nums[twoStart];
                nums[twoStart--] = 2;
            } else
                i++;
            System.out.println(Arrays.toString(nums) + " " + i);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

}
