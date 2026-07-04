class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if ((prices[r] - prices[l]) > maxProfit) {
                maxProfit = prices[r] - prices[l];
            } else if (prices[r] < prices[l]) {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
