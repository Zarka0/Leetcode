class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] res=new String[words.length];
        for(String word:words){
            int index=Character.getNumericValue(word.charAt(word.length()-1))-1;
            res[index]=word.substring(0,word.length()-1);
        }
        return String.join(" ", res);


    }
}