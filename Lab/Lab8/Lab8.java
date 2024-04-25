package Lab.Lab8;

public class Lab8 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        
        System.out.println(coinChange(coins, 11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE; 
        }

        for (int target = 1; target <= amount; target++) {
            for (int c = 0; c < coins.length; c++) {
                if (target - coins[c] >= 0 && dp[target - coins[c]] != Integer.MAX_VALUE)
                    dp[target] = Math.min(dp[target], 1 + dp[target - coins[c]]);
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return  dp[amount];
    }
}
