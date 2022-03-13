import java.util.*;

public class Dfs {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void dfsUtil(List<List<Integer>> list, int src, boolean visited[]) {
        print(src + " ");
        visited[src] = true;
        for (int i : list.get(src)) {
            if (!visited[i]) {
                dfsUtil(list, i, visited);
            }
        }
    }

    static void dfs(List<List<Integer>> list, int src) {
        boolean[] visited = new boolean[list.size()];
        dfsUtil(list, src, visited);
    }

    static void solution() throws Exception {
        List<List<Integer>> adj = new ArrayList<>();
        int edges = sc.nextInt();
        int V = sc.nextInt();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }

        dfs(adj, 1);
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