class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1_arr=s1.split(" ");
        String[] s2_arr=s2.split(" ");
        ArrayList<String> res=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s1_words: s1_arr){
            map.put(s1_words, map.getOrDefault(s1_words,0)+1);
        }
        for(String s2_words: s2_arr){
            map.put(s2_words, map.getOrDefault(s2_words,0)+1);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                res.add(entry.getKey());
            }
        }
        return res.toArray(new String[0]);
    }
}