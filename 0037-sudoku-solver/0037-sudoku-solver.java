class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number){
        for(int i = 0; i < board.length; i++){
            // Check the column and row for the same number
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }
        // Check the 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(board[i][j] == (char)(number + '0')) return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){ 
            // If we've completed the last row, the Sudoku is solved
            return true;
        }

        // Determine next cell to go to
        int nrow = 0;
        int ncol = 0;
        if(col != board.length - 1){
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.'){ // If the current cell is already filled, move to the next
            return helper(board, nrow, ncol); // Simply move forward
        } else { 
            // Try placing numbers 1 to 9 in the current empty cell
            for(int i = 1; i <= 9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0'); // Place the number
                    if(helper(board, nrow, ncol)) {
                        return true; // If placing leads to a solution, return true
                    } else {
                        board[row][col] = '.'; // Otherwise, backtrack by resetting the cell
                    }
                }
            }
        }

        return false; // No valid number can be placed, so return false
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0); // Start the solving process from the top-left corner
    }
}
