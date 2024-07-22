class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.empty()) return 0;  // Return 0 for empty input
        
        sort(nums.begin(), nums.end());
        
        int current = 1;
        int longest = 1;
        
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == nums[i - 1]) {
                // Skip duplicates
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // Consecutive element
                current++;
            } else {
                // Not consecutive, update longest and reset current
                longest = max(longest, current);
                current = 1;
            }
        }
        
        // Final check to update longest
        longest = max(longest, current);
        
        return longest;
    }
};
