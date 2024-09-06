class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
       Arrays.sort(nums);
       int sum=0;
       for(int num: nums){
        sum=sum+num;
       }
       int currentSum=0;
       for(int i=nums.length-1; i>=0; i--){
        currentSum=currentSum+nums[i];
        list.add(nums[i]);
        if(currentSum>sum-currentSum){
            break;
        }
        }
        return list;

       } 
    }
