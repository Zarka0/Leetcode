class Solution {
    public int search(int[] nums, int target) {
        for(int i=1; i<=nums.length; i++){
            if(nums[i]==target){
                return i;
            }

        }
        return -1;
    }
}