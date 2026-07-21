package num_array;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,3,4};
        int target = 10;
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int coin:coins){
            for(int i=coin;i<=target;i++){
                dp[i]+=dp[i-coin];
            }
        }
        System.out.println(dp[target]);
    }
}
