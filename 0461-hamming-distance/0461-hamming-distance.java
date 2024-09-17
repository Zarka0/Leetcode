class Solution {
    public int hammingDistance(int x, int y) {
       int newNumber=x^y;
       int count=0;
       while(newNumber!=0){
        if((newNumber & 1)==1) count++;
       
            newNumber>>=1;
        
       }
       return count;
    }
}