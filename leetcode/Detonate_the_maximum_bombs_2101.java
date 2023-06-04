import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Detonate_the_maximum_bombs_2101
 */
public class Detonate_the_maximum_bombs_2101 {

    public static int maximumDetonation(int[][] bombs) {
        var graph = new HashMap<Integer, List<Integer>>();

        int n = bombs.length;

        for (int i = 0; i < n; i++) {
            int x1 = bombs[i][0], y1 = bombs[i][1], r1 = bombs[i][2];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int x2 = bombs[j][0], y2 = bombs[j][1];

                    long dist = (long) (x1 - x2) * (x1 - x2) + (long) (y1 - y2) * (y1 - y2);
                    if (dist >= (long) r1 * r1) {
                        graph.putIfAbsent(i, new ArrayList<>());
                        graph.get(i).add(j);
                    }
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            var visited = new HashSet<Integer>();
            int sol = dfs(graph, visited, i);
            ans = Math.max(ans, sol);
        }
        return 0;
    }

    private static int dfs(HashMap<Integer, List<Integer>> graph, HashSet<Integer> visited, int i) {
        visited.add(i);
        int count = 1;
        for (int j : graph.getOrDefault(i, new ArrayList<>(null))) {
            if (!visited.contains(j)) {
                count += dfs(graph, visited, j);
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}