class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=rows*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int mid_e=matrix[mid/cols][mid%cols];
            if(mid_e==target) return true;
            else if(mid_e>target) right=mid-1;
            else{
                left=mid+1;
            }
        }
        return false;
    }
}