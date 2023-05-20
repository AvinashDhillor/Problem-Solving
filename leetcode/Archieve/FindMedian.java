import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {

    static class MedianFinder {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            if (maxpq.size() <= minpq.size()) {
                if (minpq.size() != 0 && minpq.peek() < num) {
                    maxpq.add(minpq.remove());
                    minpq.add(num);
                } else
                    maxpq.add(num);
            } else {
                if (maxpq.size() != 0 && maxpq.peek() > num) {
                    minpq.add(maxpq.remove());
                    maxpq.add(num);
                } else {
                    minpq.add(num);
                }
            }

            System.out.println("MaxPQ : " + maxpq);
            System.out.println("MinPQ : " + minpq);
        }

        public double findMedian() {
            if (maxpq.size() > minpq.size())
                return maxpq.peek();
            else
                return ((double) minpq.peek() + (double) maxpq.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {

        MedianFinder medianFinder = new MedianFinder();
        for (int i = 1; i <= 5; i++) {
            medianFinder.addNum(i);
        }

        System.out.println(medianFinder.findMedian());
    }
}
