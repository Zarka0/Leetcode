class Solution {
    public void rotate(int[] nums, int k) {
      //rotate array
      //rotate first k elements
      //rotate n-k elements
      k=k%nums.length;
      rotateA(nums, 0,nums.length-1);
      rotateA(nums,0,k-1);
      rotateA(nums,k,nums.length-1);

    }
    public void rotateA(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    } 
}