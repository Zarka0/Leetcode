class Solution {
    public int minimizedStringLength(String s) {
       char[] chars=s.toCharArray();
    HashSet<Character> set=new HashSet<>();
    for(char c: chars){
        set.add(c);
    }
    String res="";
    for(char c: set){
        res=res+c;
    }
    int count=res.length();
    return count;
}
}