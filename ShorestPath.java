import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Pair implements Comparator<Pair> {
    int v, w;

    public Pair() {
    };

    public Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public int compare(Pair p1, Pair p2) {
        return p1.w - p2.w;
    }
}

class Main{

    static void shortestPath(List<List<Pair>> adj, int src) {
        int dist[] = new int[adj.size()];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(adj.size(), new Pair());

        for (int i = 0; i < adj.size(); i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            int u = pq.peek().v;
            pq.poll();

            for (Pair p : adj.get(u)) {
                int v = p.v;
                int w = p.w;
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "->" + dist[i]);
        }

        return;
    }

    static void BFS(List<List<Pair>> list, int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];
        Arrays.fill(visited, false);
        visited[src] = true;
        q.add(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (Pair p : list.get(u)) {
                if (!visited[p.v]) {
                    visited[p.v] = true;
                    q.add(p.v);
                }
            }
        }
    }

    static void DFSUtil(List<List<Pair>> list, List<Boolean> visited, int src) {
        if (visited.get(src))
            return;

        System.out.print(src + " ");

        visited.set(src, true);

        for (Pair p : list.get(src)) {
            if (!visited.get(p.v)) {
                DFSUtil(list, visited, p.v);
            }
        }
    }

    static void DFS(List<List<Pair>> list, int src) {
        List<Boolean> visited = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            visited.add(false);

        DFSUtil(list, visited, src);
    }

    public static void main(String[] args) {
        List<List<Pair>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(new ArrayList<>());

         list.get(1).add(new Pair(2, 1));
         list.get(2).add(new Pair(3, 1));
         list.get(2).add(new Pair(5, 1));
         list.get(3).add(new Pair(6, 1));
         list.get(1).add(new Pair(7, 1));

         shortestPath(list, 1);

        /*
        Pair[] p = new Pair[10];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Pair(Integer.valueOf((int) (Math.random() * 10)), 1);
        }

        Arrays.sort(p);

        System.out.println(p.toString()); */
    }
}
