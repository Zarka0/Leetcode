class Solution {
    public int findChampion(int[][] grid) {
       int row=grid.length;
       int col=grid[0].length;
       int max=0;
       int ans=0;
       for(int r=0; r<row; r++){
        int count=0;
        for(int c=0; c<col; c++){
            if(grid[r][c]==1) count++;
            
        }
        
        if(count>max){
            max=count;
            ans=r;
        }
       }
       return ans;

    }
}