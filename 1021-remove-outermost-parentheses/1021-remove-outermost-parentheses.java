class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int balance=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(balance>0){
                    res=res+s.charAt(i);
                }
                balance++;
            }
            if(s.charAt(i)==')'){
                balance--;
                if(balance>0){
                    res=res+s.charAt(i);
                }
            }
        }
        return res;
    }
}