import java.util.*;
import java.util.LinkedList;

public class BFSPractice {

    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;

    static void Bfs(List<List<Integer>> list, int src) {
        boolean[] visited = new boolean[list.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int n = queue.poll();
            sb.append(n + " ");
            for (int i : list.get(n)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    static void dfsUtil(List<List<Integer>> list, int src, boolean[] visited) {
        sb.append(src + " ");
        visited[src] = true;
        for(int i : list.get(src)) {
            if(!visited[i]) {
                dfsUtil(list, i, visited);
            }
        }
    }

    static void Dfs(List<List<Integer>> list, int src) {
        boolean[] visited = new boolean[list.size()];
        dfsUtil(list, 0, visited);
    }

    static void solution() throws Exception {

        int N = sc.nextInt();
        int E = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        sb.append("BFS \n");
        Bfs(list, 0);
        sb.append("\nDFS \n");
        Dfs(list, 0);
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
