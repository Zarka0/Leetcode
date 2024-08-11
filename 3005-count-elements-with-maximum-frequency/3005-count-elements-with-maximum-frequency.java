class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int count=set.size();
        return count;
    }
}