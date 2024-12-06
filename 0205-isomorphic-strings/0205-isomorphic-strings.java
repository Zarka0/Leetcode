class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS=new HashMap<>();
        HashMap<Character, Character> mapT=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0; i<s.length(); i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(mapS.containsKey(sChar)){
                if(mapS.get(sChar)!=tChar) return false;
            
            }
            else{
                mapS.put(sChar, tChar);
            }
            if(mapT.containsKey(tChar)){
                if(mapT.get(tChar)!=sChar){
                    return false;
                }
            }
            else{
                mapT.put(tChar, sChar);
            }

        }
        return true;



    }
}