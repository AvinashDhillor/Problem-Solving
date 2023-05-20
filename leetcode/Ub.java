import java.util.Arrays;
import java.util.List;

public class Ub {

    static int ub(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        System.out.println(l);

        if (l == 0) {
            return -1;
        }

        if (nums[l - 1] != target)
            return -1;

        return l - 1;
    }

    static int upperBound(List<Integer> list, int target) {
        if (list == null || list.size() == 0)
            return -1;

        int l = 0, r = list.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (list.get(mid) <= target)
                l = mid + 1;
            else
                r = mid;
        }

        return list.get(l) > target ? l : -1;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1);

        System.out.println(upperBound(list, 1)); // 3

        System.out.println(ub(new int[] { 1 }, 1));
    }
}
