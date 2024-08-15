class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Map.put(c, Map.getOrDefault(c, 0) + 1);
        }
        int x=Map.get(s.charAt(0));
        for(int val: Map.values()){
            if(val!=x){
                return false;
            }
        }
        return true;
    }
}