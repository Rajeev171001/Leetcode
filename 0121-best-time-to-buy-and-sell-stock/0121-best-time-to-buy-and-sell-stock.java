class Solution {
    public int maxProfit(int[] prices) {
        int minCost=Integer.MAX_VALUE;
        int maxProfit=0;
        int curr=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minCost){
                minCost=prices[i];
            }
            curr=prices[i]-minCost;
            if(maxProfit<curr){
                maxProfit=curr;
            }
        }
        return maxProfit;
    }   
}