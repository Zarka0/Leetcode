class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
      int ans=0;
      for(int i=0; i<nums.size(); i++){
        if(numOfSetBits(i)==k){
            ans+=nums.get(i);
        }
      }
      return ans;
    } 
      public int numOfSetBits(int i){
        int count=0;
        while(i!=0){
            if((i&1)==1){
                count++;
            }
            i>>=1;
        }
        return count;
      } 
    
}