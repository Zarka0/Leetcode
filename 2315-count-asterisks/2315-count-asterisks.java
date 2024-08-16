class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int ans=0;
        for(char c: s.toCharArray()){
            if(c=='|'){
                count++;
            }
            if(count%2==0){
                if(c=='*'){
                    ans++;
                }
            }
        }
        return ans;
    }
}