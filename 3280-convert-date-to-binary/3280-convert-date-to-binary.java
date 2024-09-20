class Solution {
    public String convertDateToBinary(String date) {
        String[] words=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(String word: words){
            int n=Integer.parseInt(word);
            sb.append(Integer.toBinaryString(n));
            sb.append("-");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}