
public class WordSearch {

    static char[][] arr;

    static boolean ans = false;

    public static boolean contains(String word, int index, int x, int y, boolean[][] visited) {

        System.out.println(x + " " + y);

        if (index >= word.length())
            return false;

        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || word.charAt(index) != arr[x][y]
                || visited[x][y]) {
            return false;
        }

        System.out.println(arr[x][y]);
        visited[x][y] = true;

        for (boolean[] i : visited) {
            for (boolean j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        if (index == word.length() - 1 && arr[x][y] == word.charAt(word.length() - 1)) {
            return true;
        }

        System.out.println();

        int dir[][] = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < dir.length; i++) {
            ans |= contains(word, index + 1, x + dir[i][0], y + dir[i][1], visited);
        }

        return ans;
    }

    public static boolean exist(char[][] board, String word) {
        arr = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if (contains(word, 0, i, j, visited))
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] arr = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' }, { 'A', 'D', 'E', 'E' } };

        // { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCESEEEFS";

        // exist(arr, word);

        System.out.println(exist(arr, word));

    }
}
