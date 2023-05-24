import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Maximum_Subsequence_Score_2542 {

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Maximum_Subsequence_Score_2542.Pair o) {
            return o.x - x;
        }

        @Override
        public String toString() {
            return "Pair [x=" + x + ", y=" + y + "]";
        }

    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(new Pair(nums2[i], nums1[i]));
        }

        Collections.sort(list);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        long sum = 0;

        for (int i = 0; i < k; i++) {
            Pair pair = list.get(i);
            priorityQueue.add(pair.y);

            if (priorityQueue.size() > k)
                priorityQueue.remove();
        }

        for (int i : priorityQueue) {
            sum += i;
        }

        return 0L;
    }

    public static void main(String[] args) {
        int nums1[] = { 2, 1, 14, 12 }, nums2[] = { 11, 7, 13, 6 }, k = 3;
        System.out.print(maxScore(nums1, nums2, k));
    }
}
