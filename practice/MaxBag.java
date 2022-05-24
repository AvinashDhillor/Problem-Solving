import java.util.*;

public class MaxBag {

    private static class Custom implements Comparable<Custom> {
        int capacity;
        int rocks;
        int dif;

        public int compareTo(Custom other) {
            return this.dif - other.dif;
        }

        public Custom(int _cap, int _roc) {
            this.capacity = _cap;
            this.rocks = _roc;
            this.dif = _cap - _roc;
        }

        public String toString() {
            return "" + dif;
        }
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        Custom[] cus = new Custom[capacity.length];
        for (int i = 0; i < capacity.length; i++) {
            cus[i] = new Custom(capacity[i], rocks[i]);
        }
        Arrays.sort(cus);

        System.out.println(Arrays.toString(cus));

        int index = 0;
        int sol = 0;
        while (cus[index].dif == 0) {

            index++;
            sol++;
        }
        for (int i = index; i < cus.length; i++) {
            if (cus[i].dif <= additionalRocks) {
                additionalRocks -= cus[i].dif;
                sol++;
            } else {
                break;
            }
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] c = { 2, 3, 4, 5 };
        int[] r = { 1, 2, 4, 4 };
        int ad = 2;
        System.out.println(maximumBags(c, r, ad));
    }
}
