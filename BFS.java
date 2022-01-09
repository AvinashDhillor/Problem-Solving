import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void find(List<List<Integer>> adj, int src) {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (Integer i : adj.get(u)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void dfsUtil(List<List<Integer>> adj, int src, boolean[] visited) {
        if (visited[src])
            return;
        visited[src] = true;
        System.out.print(src + " ");
        for (Integer i : adj.get(src)) {
            if (!visited[i])
                dfsUtil(adj, i, visited);
        }
    }

    public static void dfs(List<List<Integer>> adj, int src) {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        dfsUtil(adj, src, visited);
    }

    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(Integer.valueOf(2));
        adj.get(1).add(Integer.valueOf(3));
        adj.get(2).add(Integer.valueOf(4));
        adj.get(2).add(Integer.valueOf(5));
        adj.get(4).add(Integer.valueOf(8));
        adj.get(3).add(Integer.valueOf(6));
        adj.get(6).add(Integer.valueOf(7));
        find(adj, 1);
        System.out.println();
        dfs(adj, 1);
    }
}
