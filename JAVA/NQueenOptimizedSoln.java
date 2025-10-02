
public class NQueenOptimizedSoln {

	static void printBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void recurse(int[][] board, int n, int row, 
                        boolean[] colUsed, boolean[] diagUpper, boolean[] diagBottom) {
        // base case
        if (row == n) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < n; col++) {
//        	row - col can be negative (e.g., row=0, col=3 → -3).
            int diag1 = row - col + n - 1; // upper-left diagonal index
            int diag2 = row + col;         // bottom-left diagonal index

            if (!colUsed[col] && !diagUpper[diag1] && !diagBottom[diag2]) {
                // place queen
                board[row][col] = 1;
                colUsed[col] = true;
                diagUpper[diag1] = true;
                diagBottom[diag2] = true;

                recurse(board, n, row + 1, colUsed, diagUpper, diagBottom);

                // backtrack
                board[row][col] = 0;
                colUsed[col] = false;
                diagUpper[diag1] = false;
                diagBottom[diag2] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];

        // column tracker
        boolean[] colUsed = new boolean[n];
        // upper-left diagonal tracker
        boolean[] diagUpper = new boolean[2 * n - 1];
        // bottom-left diagonal tracker
        boolean[] diagBottom = new boolean[2 * n - 1];

        recurse(board, n, 0, colUsed, diagUpper, diagBottom);
    }

}
