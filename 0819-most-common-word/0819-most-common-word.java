class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String ans="";
        HashMap<String, Integer> map=new HashMap<>();
        String str=paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words=str.split(" ");
        for(String word: words){
            if(word.length()>0){
            map.put(word, map.getOrDefault(word, 0)+1);
            }
        }
        for(String ban: banned){
            if(map.containsKey(ban)){
                map.remove(ban);
            }
        }
        int max=0;
        for(String word: map.keySet()){
            int count=map.get(word);
            if(count>max){
                max=count;
                ans=word;
            }
        }
        return ans;
    }
}