import java.util.*;

public class BitFlip {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static int minBitFlips(int start, int goal) {
        int sol = 0;
        for (int i = 0; i < 32; i++) {
            if ((start & 1 << i) != (goal & 1 << i)) {
                sol++;
            }
        }
        return sol;
    }

    static void solution() throws Exception {

        int start = 10;
        int goal = 7;
        print(minBitFlips(start, goal));
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