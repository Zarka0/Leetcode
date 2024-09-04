class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int num: arr){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }else{
            map.put(num, 1);
        }
       }
       int largest=-1;
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
        if(key==value){
            largest=Math.max(largest, key);
        }
       }
       return largest;
    }
}