class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i=0,j=1,mx =0;
        while(j<n){
            if(prices[j]>=prices[i]){
                mx = Math.max(prices[j]-prices[i],mx);
            } else {
                i=j;
            }
            j++;
        }
        return mx;
    }
}
