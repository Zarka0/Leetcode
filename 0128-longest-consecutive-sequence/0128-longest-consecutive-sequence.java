class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    if(nums.length==0){
        return 0;
    }
       int current=1;
       int longest=1;
       //checking for duplicates
       for(int i=1; i<nums.length; i++){
        if(nums[i]==nums[i-1]){
            continue;
        }
        else if(nums[i]==nums[i-1]+1){
            current++;
        }
        else{
            longest=Math.max(longest, current);
            current=1;
        }

       }
        longest=Math.max(longest, current); 
       return longest;
    }
}