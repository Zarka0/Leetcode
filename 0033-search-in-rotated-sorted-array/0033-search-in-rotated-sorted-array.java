class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==1){
        if(nums[0]==target){
            return 0;
       }
       else{
        return -1;
       }
       }   
       int start=0, end=nums.length-1;
       while(start<end){
        int mid=(start+end)/2;
        if(nums[mid]>nums[end]){
            start=mid+1;
        }
        else{
            end=mid;
        }
       }
       int pivot=start;
       start=0;
       end=nums.length-1;
       if(target>=nums[pivot] && target<=nums[end]){
        start=pivot;
       }else{
        end=pivot-1;
       }
       while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
    return -1;
}
}