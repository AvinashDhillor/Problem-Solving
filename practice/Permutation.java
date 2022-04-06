import java.util.*;

public class Permutation {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 23, 52, 2543, 23));
        list.add(5, 10);
        print(list.toString());

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