class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) {
            return false;
        }
        String Double=s+s;
        return Double.contains(goal);

    }
}