
public class SudokuSolver {
	public static boolean isSafeToPlace(String[][] board, int row, int col, String c) {
		for (int i = 0; i < board.length; i++) {
			// check row
			if (board[row][i].equals(c))
				return false;

			// check column
			if (board[i][col].equals(c))
				return false;

			// check 3x3 subgrid
			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3].equals(c))
				return false;
		}
		return true;
	}

	public static boolean solve(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j].equals(".")) {
					for (char val = '1'; val <= '9'; val++) {
						if (isSafeToPlace(board, i, j, String.valueOf(val))) {
							board[i][j] = String.valueOf(val);

							if (solve(board) == true)
								return true;
							else
								board[i][j] = ".";
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public static void printBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[][] board = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
				{ "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
				{ "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
				{ "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
				{ ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };

		if (solve(board)) {
			System.out.println("Solved Sudoku:");
			printBoard(board);
		} else {
			System.out.println("No solution exists.");
		}

	}

}
