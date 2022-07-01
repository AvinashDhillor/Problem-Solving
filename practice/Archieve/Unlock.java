import java.util.List;

public class Unlock {

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int src) {
        visited[src] = true;
        for (Integer i : rooms.get(src)) {
            if (!visited[i]) {
                dfs(rooms, visited, i);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        for (boolean i : visited) {
            if (!i)
                return false;
        }
        return true;
    }
}
