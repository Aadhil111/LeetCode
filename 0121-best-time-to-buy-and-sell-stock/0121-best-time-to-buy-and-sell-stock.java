class Solution {
    public int maxProfit(int[] prices) {
        int minValue=prices[0];
        int maxProfit=0;

        for(int value : prices){
            if(value<minValue){
                minValue=value;
            }
            else{
                maxProfit=Math.max(maxProfit ,value-minValue);
            }
        }

        return maxProfit;
    }
}