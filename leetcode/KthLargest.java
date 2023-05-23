import java.util.PriorityQueue;

public class KthLargest {

    static class KthLar {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int maxSize;

        public KthLar(int k, int[] nums) {
            maxSize = k;

            for (int i : nums) {
                pq.add(i);
                if (pq.size() > k)
                    pq.remove();
            }
        }

        public int add(int val) {
            pq.add(val);
            if (pq.size() > maxSize) {
                pq.remove();
            }

            return pq.peek();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 2 };
        KthLar kLar = new KthLar(3, arr);
        System.out.println(kLar.add(3));
        System.out.println(kLar.add(5));
        System.out.println(kLar.add(10));
        System.out.println(kLar.add(9));
        System.out.println(kLar.add(4));
    }
}
