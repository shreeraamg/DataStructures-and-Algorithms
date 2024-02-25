package problemSolving.arrays;

public class BestTimeToBuySell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int max = 0;

        while(right < prices.length) {
            if(prices[left] < prices[right])
                max = Math.max(max, prices[right] - prices[left]);
            else
                left = right;
            right++;
        }

        return max;
    }
}
