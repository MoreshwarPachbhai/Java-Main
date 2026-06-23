package Arrays;

// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class StockBuyAndSell {

    public static int maxProfit(int[] prices, int n) {

        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int price = prices[i];

            if (price < minprice) {
                minprice = price;
            }

            int profit = price - minprice;

            if (profit > maxprofit) {
                maxprofit = profit;
            }

        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;

        int result = maxProfit(prices, n);

        System.out.println("Maximum Profit: " + result);
    }

}