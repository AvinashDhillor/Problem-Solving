import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparator<Pair> {

    int v, w;

    public Pair() {
    }

    public Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.w - o2.w;
    }

}

public class ShortestPath {
    public static void main(String[] args) {
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(new Pair(2, 2));
        adj.get(1).add(new Pair(3, 1));
        adj.get(1).add(new Pair(5, 7));
        adj.get(1).add(new Pair(6, 1));
        adj.get(2).add(new Pair(4, 1));
        adj.get(2).add(new Pair(5, 1));
        adj.get(3).add(new Pair(6, 1));
        adj.get(3).add(new Pair(4, 1));

        path(adj, 1);
    }

    private static void path(List<List<Pair>> adj, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(adj.size(), new Pair());
        int[] dist = new int[adj.size()];

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
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "->" + dist[i]);
        }
    }
}
