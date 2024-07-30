class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        int robE=0;
        int robO=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                robE=max(robE+nums[i], robO);
            }else{
            robO=max(robO+nums[i], robE);
            }
        }
        return max(robE,robO);
    }
};