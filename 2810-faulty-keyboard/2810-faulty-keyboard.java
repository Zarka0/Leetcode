class Solution {
    public String finalString(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='i'){
                res=res.reverse();
               
                
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

}