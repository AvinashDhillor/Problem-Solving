public class GameOfLife {

    int countN(int[][] board, int x, int y) {
        int[][] dir = {
                { -1, -1 },
                { -1, 0 },
                { -1, 1 },
                { 0, 1 },
                { 0, -1 },
                { 1, -1 },
                { 1, 0 },
                { 1, 1 }
        };

        int nei = 0;
        for (int i = 0; i < 8; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];
            boolean checkX = newX >= 0 && newX < board.length;
            boolean checkY = checkX && newY >= 0 && newY < board[0].length;
            if (checkY && board[newX][newY] == 1) {
                System.out.println(newX + " " + newY + " " + board[newX][newY]);
                nei++;
            }
        }

        if (nei > 3 || nei < 2) {
            if (board[x][y] == 1) {
                board[x][y] = 3;
            }
        }

        if (board[x][y] == 0 && nei == 3) {
            board[x][y] = 2;
        }

        return nei;
    }

    public void gameOfLife(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // int n = countN(board, 0, 1);

        // for(int i = 0; i < board.length; i++) {
        // for(int j = 0; j < board[0].length; j++) {
        // int n = countN(board, i , j);

        // System.out.print(board[i][j]+"->" + n + " ");
        // }

        // System.out.println();
        // }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j] % 2;
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
        new GameOfLife().gameOfLife(
                board);
    }
}
