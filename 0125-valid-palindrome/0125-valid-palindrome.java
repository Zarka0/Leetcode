class Solution {
    public boolean isPalindrome(String s) {
   s=s.toLowerCase();
    s=s.replaceAll("[^a-zA-Z0-9]","");
    
    String rstr="";
    for(int i=s.length()-1; i>=0; i--){
        rstr=rstr+s.charAt(i);
    }
    
    return rstr.equals(s);
    }
}