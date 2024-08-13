class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String[] parts = words.get(i).split("["+separator+"]");
            for (String part : parts) {
                if (!part.isEmpty()) {
                    res.add(part);
                }
            }
        }
        return res;
    }
}
