class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int i=lowLimit; i<=highLimit; i++){
            int value=0;
            int temp=i;
            while(temp!=0){
                value+=temp%10;
                temp/=10;
            }
            map.put(value, map.getOrDefault(value,0)+1);
            if(map.get(value)>count){
                count=map.get(value);
            }
            
        }
        return count;
    }
}