class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0;
        int j=n;
        for(int k=0; k<nums.length/2; k++){
            res[2*k]=nums[i];
            res[2*k+1]=nums[j];
            j++;
            i++;
        
        
        }
        return res;
    }

}