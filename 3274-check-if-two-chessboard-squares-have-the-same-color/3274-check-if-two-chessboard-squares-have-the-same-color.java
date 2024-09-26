class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        //true for black
       int c1= coordinate1.charAt(0)+coordinate1.charAt(1);
       boolean C1=false;
       int c2=coordinate2.charAt(0)+coordinate2.charAt(1);
       boolean C2=false;
       if(c1%2==0){
        C1=true;
       }
        if(c2%2==0){
        C2=true;
       }
       return C1==C2;
    }
}