class Solution {
    public int reverse(int x) {
       boolean isNegative=x<0;
       if(isNegative){
        x=-1*x;
       } 
       int lastDig;
       int rev=0;
       while(x>0){
        lastDig=x%10;
        if (rev > (Integer.MAX_VALUE - lastDig) / 10) {
    return 0;
}
        rev=rev*10+lastDig;
        x=x/10;
       }
       if(isNegative) return -1*rev;
       return rev;
    }
}