/**
 * Number_of_Provinces_547
 */
public class Number_of_Provinces_547 {

    public static int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1 && !visited[i]) {
                    dfs(i, visited, isConnected);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int i, boolean[] visited, int[][] isConnected) {
        visited[i] = true;

        for (int j = 0; j < isConnected[0].length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == false) {
                dfs(j, visited, isConnected);
            }
        }
    }

    public static void main(String[] args) {

    }
}