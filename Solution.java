public class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (max < price - minPrice) {
                max = price - minPrice;
            }
        }
        return max;
    }
}