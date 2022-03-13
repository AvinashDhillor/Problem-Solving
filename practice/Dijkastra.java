import java.util.*;

public class Dijkastra {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void solution() throws Exception {
        List<List<Integer>> list = new ArrayList<>();
        int V = sc.nextInt();
        int E = sc.nextInt();
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
        }

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