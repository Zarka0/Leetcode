class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // An empty string is a subsequence of any string
        }
        char[] schars=s.toCharArray();
        char[] tchars=t.toCharArray();

        int i=0;//for s
        //int j=0;//for t
        for(int j=0; j<t.length(); j++){
            if(schars[i]==tchars[j]){
                i++;
            }
            if(i==s.length()){
                return true;
            }
        }
        return false;
    }
}