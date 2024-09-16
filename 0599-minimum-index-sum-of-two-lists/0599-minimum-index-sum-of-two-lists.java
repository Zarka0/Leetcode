class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        int minIndexSum=Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        for(int j=0; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                int indexSum=j+map.get(list2[j]);
            
            if(indexSum<minIndexSum){
                res.clear();
                res.add(list2[j]);
                minIndexSum=indexSum;

            }
            else if(indexSum==minIndexSum){
                res.add(list2[j]);
            }
        }
        }
        return res.toArray(new String[res.size()]);
    }
}