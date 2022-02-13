package easy.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            maxProfit = Math.max(price - min, maxProfit);
        }
        return maxProfit;
    }
}
