class Solution {
    public double minimumAverage(int[] nums) {
    int n=nums.length;
    double[] avg=new double[n/2];
     Arrays.sort(nums);
     for(int i=0; i<n/2; i++){
        avg[i]=(nums[i]+nums[n-i-1])/2.0;
     }
     Arrays.sort(avg);
        return avg[0];  
    }
}