import java.util.*;

public class MaxSub {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static long maximumSubsequenceCount(String text, String pattern) {
        int[] one = new int[text.length()];
        int[] two = new int[text.length()];
        int one_count = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == pattern.charAt(1)) {
                one[i] = ++one_count;
            } else
                one[i] = one_count;
        }

        one_count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                two[i] = ++one_count;
            } else
                two[i] = one_count;
        }

        long first = one[0];
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                first += one[i + 1];
            }
        }

        long second = two[text.length() - 1];
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(1)) {
                second += two[i - 1];
            }
        }
        return Math.max(first, second);
    }

    static void solution() throws Exception {
        String one = sc.next();
        String two = sc.next();
        print(maximumSubsequenceCount(one, two));
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