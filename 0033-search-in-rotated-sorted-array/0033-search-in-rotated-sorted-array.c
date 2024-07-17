int search(int* nums, int numsSize, int target) {
    if(numsSize == 1) {
        return nums[0] == target ? 0 : -1;
    }

    int start = 0, end = numsSize - 1;
    
    // Find the index of the smallest value using binary search.
    while(start < end) {
        int mid = (start + end) / 2;
        if(nums[mid] > nums[end]) {
            start = mid + 1;
        } else {
            end = mid;
        }
    }
    
    int pivot = start;
    start = 0;
    end = numsSize - 1;
    
    // Determine which part of the array to search in.
    if(target >= nums[pivot] && target <= nums[end]) {
        start = pivot;
    } else {
        end = pivot - 1;
    }
    
    // Regular binary search.
    while(start <= end) {
        int mid = (start + end) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    
    return -1;  // Target not found.
}
