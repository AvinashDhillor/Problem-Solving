import java.util.*;

public class MaxLines {

    private static class Custom implements Comparable<Custom> {
        int x;
        int y;

        public int compareTo(Custom other) {
            if (this.x == other.x) {
                return this.y - other.y;
            } else
                return this.x - other.x;
        }

        public Custom(int _cap, int _roc) {
            this.x = _cap;
            this.y = _roc;
        }

        public String toString() {
            return x + "," + y;
        }
    }

    public static double solve(Custom c1, Custom c2) {
        double first = (double) c2.y - (double) c1.y;
        double second = (double) c2.x - (double) c1.x;
        return first / second;
    }

    public static int minimumLines(int[][] stockPrices) {
        Custom[] cus = new Custom[stockPrices.length];
        for (int i = 0; i < stockPrices.length; i++) {
            cus[i] = new Custom(stockPrices[i][0], stockPrices[i][1]);
        }

        Arrays.sort(cus);
        System.out.println(Arrays.toString(cus));
        int sol = 0;
        double prev = Double.MAX_VALUE;
        System.out.println(prev);
        for (int i = 1; i < cus.length; i++) {
            double sl = solve(cus[i - 1], cus[i]);
            System.out.println(sl);
            if (prev == sl) {
                continue;
            }
            sol++;
            prev = sl;
        }
        return sol;
    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 7 }, { 2, 6 }, { 3, 5 }, { 4, 4 }, { 5, 4 }, { 6, 3 }, {
        // 7, 2 }, { 8, 1 } };
        // int[][] arr = { { 1, 1 }, { 2, 3 }, { 3, 1 }, { 1000000000, 1 }, { 10, 1 }, {
        // 5, 2 }, { 6, 3 } };
        int[][] arr = { { 1000000000, 1000000000 }, { 100000000, 1978 }, { 10000000, 1000000000 } };
        System.out.println(minimumLines(arr));
    }
}
