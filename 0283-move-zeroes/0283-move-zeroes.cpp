class Solution {
public:
    void moveZeroes(std::vector<int>& nums) {
        int nonZeroIndex = 0; //for non zero elements
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i]; // If non zero then place in correct order
            }
        }

        //now fill with zero
        for (int i = nonZeroIndex; i < nums.size(); ++i) {
            nums[i] = 0;
        }
    }
};
