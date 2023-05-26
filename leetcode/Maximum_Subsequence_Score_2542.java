import java.util.Arrays;
import java.util.PriorityQueue;

public class Maximum_Subsequence_Score_2542 {

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return o.y - y;
        }

        @Override
        public String toString() {
            return "Pair [x=" + x + ", y=" + y + "]";
        }

    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        Pair pairs[] = new Pair[n];

        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nums1[i], nums2[i]);
        }

        Arrays.sort(pairs);

        System.out.println(Arrays.toString(pairs));

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(k);

        long topSum = 0;

        for (int i = 0; i < k; i++) {
            Pair p = pairs[i];
            topSum = p.x;
            pQueue.add(p.x);
        }

        long ans = topSum * pairs[k - 1].y;

        for (int i = k; i < n; i++) {
            topSum += pairs[i].x - pQueue.poll();
            pQueue.add(pairs[i].x);
            ans = Math.max(ans, topSum * pairs[i].y);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums1[] = { 2, 1, 14, 12 }, nums2[] = { 11, 7, 13, 6 }, k = 3;
        System.out.print(maxScore(nums1, nums2, k));
    }
}
