import java.util.ArrayList;
import java.util.List;

public class tagetSum {
    static int count = 0;

    static void util(int[] nums, int index, int target, int sum, List<Integer> list) {

        if (index == nums.length && sum == target) {
            count++;
        }

        if (index >= nums.length) {
            return;
        }

        util(nums, index + 1, target, sum + nums[index], list);
        util(nums, index + 1, target, sum - nums[index], list);
    }

    static int find(int[] nums, int target) {
        util(nums, 0, target, 0, new ArrayList<>());
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int target = 20;

        System.out.println(find(nums, target));
    }

}
