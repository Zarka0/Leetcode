class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars=word.toCharArray();
        int index=-1;
        for(int i=0; i<chars.length; i++){
            if(chars[i]==ch){
                index=i;
                break;
            }
        }
        if(index!=-1){
            return new StringBuilder(word.substring(0,index+1)).reverse().toString()+word.substring(index+1);
        }
        return word;

    }
}