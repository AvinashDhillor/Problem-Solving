import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class JavaCustomSort {
    private static class Custom implements Comparable<Custom> {
        private int Edge;
        private int Weight;

        Custom(int _E, int _Weight) {
            this.Edge = _E;
            this.Weight = _Weight;
        }

        // public int compare(Custom one, Custom two) {
        // if (one.Weight == two.Weight) {
        // return one.Edge - two.Edge;
        // }
        // return one.Weight - two.Weight;
        // }ṇ

        public int compareTo(Custom two) {
            if (this.Weight == two.Weight) {
                return this.Edge - two.Edge;
            }
            return this.Weight - two.Weight;
        }
    }

    public static void main(String[] args) {
        Custom[] custom = new Custom[5];
        custom[0] = new Custom(10, 12);
        custom[1] = new Custom(52, 23);
        custom[2] = new Custom(63, 72);
        custom[3] = new Custom(92, 64);
        custom[4] = new Custom(72, 64);

        Arrays.sort(custom);

        for (Custom i : custom) {
            System.out.println(i.Edge + " " + i.Weight);
        }

        PriorityQueue<Custom> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Custom(10, 12));
        pq.add(new Custom(52, 23));
        pq.add(new Custom(63, 72));
        pq.add(new Custom(92, 64));
        pq.add(new Custom(72, 64));
        System.out.println();
        while (!pq.isEmpty()) {
            Custom i = pq.poll();
            System.out.println(i.Edge + " " + i.Weight);
        }
    }
}
