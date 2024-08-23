class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       int pairs=0;
       for(int i=0; i<words.length; i++){
        for(int j=i+1; j<words.length; j++){
        if(isRev(words[i],words[j]) && i<j){
            pairs++;
        }
        }
       }
       return pairs;

    }
    public boolean isRev(String a, String b){
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        String newS= sb.reverse().toString();
        return newS.equals(b);

    }
}