class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mcount=new int[26];
        int[] rcount=new int[26];
        for(char c: magazine.toCharArray()){
            mcount[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            rcount[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if(rcount[i]>mcount[i]){
                return false;
            }
        }
        return true;
    }
}