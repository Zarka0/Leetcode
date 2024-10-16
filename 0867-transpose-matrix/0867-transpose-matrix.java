class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length; // number of columns in the original matrix
        int[][] result = new int[m][n]; // transposed matrix size
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j]; // swap rows and columns
            }
        }
        return result;
    }
}
