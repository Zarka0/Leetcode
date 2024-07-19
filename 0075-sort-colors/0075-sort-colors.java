class Solution {
    public void sortColors(int[] nums) {
        //cant use Arrays.sort()
        boolean isSwapped;
        for(int i=0; i<arr.length-1; i++){
            isSwapped=false;
            for(int j=0; j<arr.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwapped=true;
                }

            }
            if(isSwapped==false){
                break;
            }
        }
        
    }
}