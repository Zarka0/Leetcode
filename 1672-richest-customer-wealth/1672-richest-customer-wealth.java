class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows=accounts.length;
        int cols=accounts[0].length;
        int currRow=0;
        int maxRow=0;
        for(int i=0; i<rows; i++){
            currRow = 0; 
            for(int j=0; j<cols; j++){
                currRow=currRow+accounts[i][j];
                
            }
            maxRow=Math.max(currRow, maxRow);
        }
        return maxRow;
    }
}