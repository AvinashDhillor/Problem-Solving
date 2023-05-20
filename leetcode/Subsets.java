import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static List<List<Integer>> list = new ArrayList<>();

    private static int k;

    public static void util(List<Integer> tl, int[] nums, int index) {
        if (tl.size() == k) {
            list.add(new ArrayList<>(tl));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            int num = nums[i];
            tl.add(num);
            util(tl, nums, i + 1);
            tl.remove(tl.size() - 1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {

        for (k = 0; k < nums.length + 1; k++) {
            List<Integer> lists = new ArrayList<>();
            util(lists, nums, 0);
        }
        return list;
    }

    public static void main(String[] args) {
        subsets(new int[] { 1, 2, 3 });
        System.out.println(subsets(new int[] { 1, 2, 3 }));

    }
}
