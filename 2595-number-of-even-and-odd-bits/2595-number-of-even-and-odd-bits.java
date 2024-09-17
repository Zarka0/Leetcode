class Solution {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        int even=0;
        int odd=0;
        int index=0;
        while(n!=0){
            if((n&1)==1){
                if(index%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            n>>=1;
            index++;
        }
        res[0]=even;
        res[1]=odd;
        return res;
    }
}