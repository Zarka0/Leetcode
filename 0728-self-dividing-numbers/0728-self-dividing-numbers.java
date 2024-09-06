class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       ArrayList<Integer> res = new ArrayList<>();
       for(int i = left; i <= right; i++){
           if(isDiv(i)){
               res.add(i);
           }
       }
       return res; 
    }

    public boolean isDiv(int num){
        int og = num;  // Store the original number
        while(num != 0){
            int dig = num % 10;
            if(dig == 0 || og % dig != 0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
