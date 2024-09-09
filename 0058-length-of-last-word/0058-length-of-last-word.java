class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int ans=words[words.length-1].length();
        return ans;
        
    }
}