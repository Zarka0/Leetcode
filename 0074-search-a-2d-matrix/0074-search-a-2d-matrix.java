class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(matrix.length==0) return false;
        int left=0;
        int right=rows*cols-1;
        while(left<=right){
            int midpoint=left+(right-left)/2;
         int mid_element=matrix[midpoint/cols][midpoint%cols];
         if(mid_element==target){
            return true;
         }else if(mid_element>target){
            right=midpoint-1;
         }else if(mid_element<target){
            left=midpoint+1;
         }
        }
        return false;
    }
}