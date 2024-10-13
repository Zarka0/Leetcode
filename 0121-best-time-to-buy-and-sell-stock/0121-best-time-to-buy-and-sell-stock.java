class Solution {
    public int maxProfit(int[] prices) {
       int min_Price=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i=0; i<prices.length; i++){
        if(prices[i]<min_Price){
            min_Price=prices[i];
        }else if(maxProfit<prices[i]-min_Price){
            maxProfit=prices[i]-min_Price;
        }
       }
       return maxProfit; 
    }
}