import java.util.LinkedList;
import java.util.Queue;

/**
 * Shortest_Path_in_Binary_Matrix_1091
 */
public class Shortest_Path_in_Binary_Matrix_1091 {

    static int[][] dir = {
            { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, -1 }, { 1, 1 }, { -1, 1 }, { 1, -1 }
    };

    static int bfs(int[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dist = new int[n][m];
        Queue<Integer[]> queue = new LinkedList<>();

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                dist[i][j] = Integer.MAX_VALUE;
        }

        dist[row][col] = 0;

        queue.add(new Integer[] { row, col });

        while (!queue.isEmpty()) {
            Integer u[] = queue.poll();
            int parentRow = u[0], parentCol = u[1];

            for (int[] i : dir) {
                int nextRow = parentRow + i[0];
                int nextCol = parentCol + i[1];

                if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && grid[nextRow][nextCol] == 0
                        && visited[nextRow][nextCol] == false) {
                    dist[nextRow][nextCol] = Math.min(dist[parentRow][parentCol] + 1, dist[nextRow][nextCol]);
                    visited[nextRow][nextCol] = true;
                    queue.add(new Integer[] { nextRow, nextCol });
                }
            }
        }
        return dist[n - 1][m - 1];
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0)
            return -1;
        int ans = bfs(grid, 0, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans + 1;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        System.out.println(shortestPathBinaryMatrix(arr));
    }
}