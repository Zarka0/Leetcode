class Solution {
    public int missingNumber(int[] nums) {
        int numsXor=0;
        int nXor=0;
        int n=nums.length;
        for(int i=0; i<=n; i++){
            nXor^=i;
        }
        for(int num: nums){
            numsXor^=num;
        }
        return numsXor^nXor;

    }
}