package DSA.Array;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BuyAndSell {

    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i< prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else if(prices[i]-buy>profit)
            {
               profit=prices[i]-buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 6, 2, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }

}
