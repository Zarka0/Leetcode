class Solution {
    
    public int sum(int i, int[] nums){
        int sum_temp=0;
        for(int k=0; k<=i; k++){
            sum_temp=sum_temp+nums[k];
        }
        return sum_temp;
    }
    public int[] runningSum(int[] nums) {
            int res[]=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]=sum(i,nums);
        }
        return res;
    }
}