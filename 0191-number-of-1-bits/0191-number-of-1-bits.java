class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0; i<binary(n).length(); i++){
            if(binary(n).charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public String binary(int n){
        //StringBuilder s=new StringBuilder();
        String s=Integer.toBinaryString(n);
        return s;
    }
}