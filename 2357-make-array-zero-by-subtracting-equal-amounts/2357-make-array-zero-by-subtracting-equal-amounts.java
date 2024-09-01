class Solution {
    public int minimumOperations(int[] nums) {
     HashSet<Integer> op=new HashSet<>();
     for(int i=0; i<nums.length; i++){
        if(nums[i]>0){
            op.add(nums[i]);
        }
     }
     return op.size();   
    }
}