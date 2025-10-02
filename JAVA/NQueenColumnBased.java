public class NQueenColumnBased {

    public static void printBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // check if it's safe to place queen at (row, col)
    private static boolean isSafeToPlace(int[][] board, int row, int col, int n) {
        // check row (left side only, since we place column by column)
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 1) {
                return false;
            }
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // check bottom-left diagonal
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // recursion based on columns
    public static void recurse(int n, int[][] board, int col) {
        // base case
        if (col == n) {
            printBoard(board);
            return;
        }

        // try placing queen in each row of current column
        for (int row = 0; row < n; row++) {
            if (isSafeToPlace(board, row, col, n)) {
                board[row][col] = 1;
                recurse(n, board, col + 1); // move to next column
                board[row][col] = 0; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        recurse(n, board, 0);
    }
}
