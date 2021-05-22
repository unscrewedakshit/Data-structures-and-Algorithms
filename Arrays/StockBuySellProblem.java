package arrays;

public class StockBuySellProblem {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,12};
        System.out.println(maxProfitEfficient(array));
    }

    private static int maxProfitEfficient(int[] price) { // Time Complexity: Theta(N)
        int profit = 0;
        for(int i=1; i<price.length; i++) {
            if(price[i] > price[i-1] ) {
                profit = profit + price[i] - price[i-1];
            }
        }
        return profit;
    }

    private static int maxProfitNaive(int[] price, int start, int end) {
        if(end <= start) return 0;
        int profit = 0;
        for(int i=start; i<end; i++) {
            for(int j=i+1; j<=end; j++) {
                if(price[j] > price[i]) {
                    int currentProfit = price[j] - price[i] + maxProfitNaive(price,start,i-1) + maxProfitNaive(price,j+1,end);
                    profit = Math.max(profit,currentProfit);
                }
            }
        }
        return profit;
    }
}
