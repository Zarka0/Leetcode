class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len=nums.length;
        for(int i=0; i<len-k; i++){
            if(nums[i]==1){
                for(int j=i+1; j<=i+k; j++){
                    if(nums[j]==1){
                        return false;
                    }
                }
            }
        }
        if(nums[len-1]==1){
            for(int l=len-k; l<len-1; l++){
                if(nums[l]==1){
                    return false;
                }
            }
        }
        return true;
    }
}