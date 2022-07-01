import java.util.*;

public class MinWhite {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
        String[] tmps = floor.split("0+");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (String i : tmps) {
            pq.add(i.length());
        }

        while (numCarpets > 0 && !pq.isEmpty()) {
            int tmp = pq.poll();
            if (tmp < carpetLen) {
                numCarpets -= 1;
                continue;
            }
            int aol = tmp / carpetLen;
            int covered = Math.min(numCarpets, aol);
            numCarpets -= covered;
            int remain = tmp - covered * carpetLen;
            if (remain != 0)
                pq.add(remain);
        }

        int sum = 0;

        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    static void solution() throws Exception {
        String floor = "11111";
        int numCarpets = 2;
        int carpetLen = 3;
        print(minimumWhiteTiles(floor, numCarpets, carpetLen));
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