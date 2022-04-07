import java.util.*;

public class Permutation {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static void generate(int[] nums, int index, int[] tmp) {
        if (index >= nums.length) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            tmp[index] = nums[i];
            generate(nums, index, tmp);
            generate(nums, index + 1, tmp);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        int[] tmp = new int[nums.length];
        generate(nums, 0, tmp);
        return null;
    }

    static void solution() throws Exception {

        int[] a = { 1, 2, 3 };
        permute(a);

    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        sb = new StringBuilder();

        solution();
        print(sb);

        sc.close();
    }

    static void print(Object s) {
        System.out.print(s);
    }

}