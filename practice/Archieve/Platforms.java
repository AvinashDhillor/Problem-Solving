import java.util.*;

public class Platforms {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int[] energy = new int[n];
        energy[0] = 0;
        energy[1] = Math.abs(list.get(0) - list.get(1));
        // energy = diff of i + 1 - i or 3 * (i + 3 - i)
        List<Integer> platform = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            energy[i] = Math.min(Math.abs(list.get(i) - list.get(i - 1) + energy[i - 1]),
                    (3 * Math.abs(list.get(i) - list.get(i - 2)) + energy[i - 2]));
        }

        for (int i : energy)
            print(i + endl);
        print(energy[n - 1] + endl);

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