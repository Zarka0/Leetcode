class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotateA(nums,0,nums.length-1);
        rotateA(nums,0,k-1);
        rotateA(nums,k,nums.length-1);


    }
    public void rotateA(int[] nums, int i, int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}