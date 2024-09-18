class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int a=(n&1);
            n>>=1;
            if((a^(n&1))==0) return false;
            n>>=1;
        }
        return true;
    }
}