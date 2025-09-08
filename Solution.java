class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int minPrice = prices[0];
        int bestProfit1 = 0;
        int sellIndex = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] - minPrice > bestProfit1) {
                bestProfit1 = prices[i] - minPrice;
                sellIndex = i;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        int bestProfit2 = 0;
        if (sellIndex < n - 1) {
            int minPrice2 = prices[sellIndex + 1];
            for (int i = sellIndex + 1; i < n; i++) {
                if (prices[i] - minPrice2 > bestProfit2) {
                    bestProfit2 = prices[i] - minPrice2;
                }
                if (prices[i] < minPrice2) {
                    minPrice2 = prices[i];
                }
            }
        }

        return bestProfit1 + bestProfit2;
    }
}