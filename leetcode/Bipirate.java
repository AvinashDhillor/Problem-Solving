import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bipirate {

    public static void main(String[] args) {
        int[][] graph =

                { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };

        int[] color = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0 && !bfs(graph, color, i)) {
                System.out.println("False");
                System.exit(0);
            }
        }

        System.out.println("True");

    }

    private static boolean bfs(int[][] graph, int[] colors, int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        colors[node] = 1;
        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int j : graph[u]) {
                if (colors[j] == 0) {
                    colors[j] = -colors[u];
                    queue.add(j);
                } else if (colors[j] == colors[u]) {
                    return false;
                }
            }
        }
        return true;
    }

}
