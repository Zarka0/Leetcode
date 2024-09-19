class Solution {
    public int bitwiseComplement(int n) {
        int i=0; //will store the length of binary rep of n
        int k=n;
        if(n==0) return 1;
        while(k>0){//this calculates the length of binary rep of n
            i++;
            k>>=1;
        }
        int a = ((1<<i)-1);//will give bitmask
        return a^n;
    }
}