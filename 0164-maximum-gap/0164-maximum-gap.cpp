class Solution {
public:
    int maximumGap(std::vector<int>& nums) {
        if (nums.size() < 2) return 0;

        // Sort the array
        std::sort(nums.begin(), nums.end());

        int maxGap = 0;

        // Calculate the maximum difference between successive elements
        for (int i = 1; i < nums.size(); ++i) {
            maxGap = std::max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }
};

 