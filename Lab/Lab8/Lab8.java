package Lab.Lab8;

public class Lab8 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        coinChange(coins, 11);
    }
    public static int coinChange(int[] coins, int amount) {
        int min = Integer.MAX_VALUE;
        for(int i = coins.length-1; i >= 0; i--){
            Math.min(min, coinChangeHelper(coins, amount,i));
        }
        return -1;
    }
    public static int coinChangeHelper(int[] coins, int amount, int ind){
       if(ind < 0){
            return -1;
       }
       if(amount < 0){
        return 0;
       }
    }
}
