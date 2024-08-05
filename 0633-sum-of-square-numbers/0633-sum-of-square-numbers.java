class Solution {
    public boolean judgeSquareSum(int c) {
        long long start=0;
        long long end=(long long)Math.sqrt(c);
        while(start<=end){
        long long ans=(start*start)+(end*end);
            if(ans==c) return true;
            else if(ans>c){
                end--;
            }else{
                start++;
            }
        }
        return false;

    }
}