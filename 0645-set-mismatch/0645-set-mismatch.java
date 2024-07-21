class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> unq=new HashSet<>();
        int[] res=new int[2];
        for(int num: nums){
            if(unq.contains(num)){
                res[0]=num;
            }
            else{
                unq.add(num);
            }
        }
        for(int i=1; i<=nums.length; i++){
            if(!unq.contains(i)){
                res[1]=(i);
            }
        }
        return res;
    }
}