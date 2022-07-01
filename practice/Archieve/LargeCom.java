import java.util.HashMap;
import java.util.Map;

public class LargeCom {

    public static int largestCombination(int[] candidates) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < candidates.length; i++) {
            int num = candidates[i];
            for (int j = 31; j >= 0; j--) {
                if ((num & (1 << j)) > 0) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 31; i++) {
            int size = map.getOrDefault(i, 0);
            max = Math.max(size, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int candidates[] = { 8, 8 };
        System.out.println(largestCombination(candidates));
    }
}