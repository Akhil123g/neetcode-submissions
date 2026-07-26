class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mxProfit = 0, minStock = prices[0];
        for(int i=0;i<n;i++){
            mxProfit = Math.max(mxProfit, prices[i]-minStock);
            //min stock is updated after max profit is calculated cause the min stock should be of past 
            minStock = Math.min(prices[i], minStock);
        }
        return mxProfit;
    }
}
