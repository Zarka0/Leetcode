class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans=-1;
        int maxCount=-1;
        for(int divisor: divisors){
            int count=0;
            for(int num: nums){
                if(num%divisor==0){
                    count++;
                }
            }
        
        if(count>maxCount || (count==maxCount) && divisor<ans){
            maxCount=count;
            ans=divisor;

        }
    }
    return ans;
    }
}