class Solution {
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += ".";
                }
            }
            newBoard.add(row); // Add the entire row after building it
        }
        allBoards.add(newBoard); // Add the board after finishing all rows
    }

    public boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') return false;
        }
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') return false; // Fixed ==
        }
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') return false;
        }
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') return false;
        }
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') return false;
        }
        return true;
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0); // Start recursive solving
        return allBoards; // Return the result
    }
}
