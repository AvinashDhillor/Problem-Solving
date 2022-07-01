import java.util.*;

public class NumWays {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    public static long numberOfWays(String s) {

        String[] one = s.split("1+");
        String[] two = s.split("0+");

        print(Arrays.toString(one) + endl);
        print(Arrays.toString(two) + endl);

        List<Integer> list = new ArrayList<>();
        int i1 = 0, i2 = 0;
        for (int i = 0; i < one.length + two.length; i++) {
            if (s.charAt(0) == '0') {
                if (i % 2 == 0) {
                    list.add(one[i1++].length());
                } else {
                    list.add(two[i2++].length());
                }
            } else {
                if (i % 2 == 0) {
                    list.add(two[i1++].length());
                } else {
                    list.add(one[i2++].length());
                }
            }
        }

        print(Arrays.toString(one));
        return 0L;
    }

    static void solution() throws Exception {
        String s = "001101";
        numberOfWays(s);
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