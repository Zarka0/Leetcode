class Solution {
    public int minLength(String s) {
        boolean flag=true;
        while(flag!=false){
            if(s.contains("AB")){
                s=s.replace("AB", "");
            }else if(s.contains("CD")){
                s=s.replace("CD", "");
            }else{
                flag=false;
            }
        }
        return s.length();
    }
}