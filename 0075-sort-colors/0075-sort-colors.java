class Solution {
    public void sortColors(int[] nums) {
        int i=0; //current
        int j=0; //last pos of 0s
        int k=nums.length-1;//first position of 2s
        while(i<=k){
            if(nums[i]==0){
                swap(nums, i, j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else if(nums[i]==2){
                swap(nums, i,k);
                k--;
            }
        }

    }
    void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}