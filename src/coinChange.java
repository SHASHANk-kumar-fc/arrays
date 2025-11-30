class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int [coins.length][amount+1];

        for(int j=0;j<=amount;j++){
            if(j % coins[0] == 0) dp[0][j] = j / coins[0];
            else dp[0][j] = (int)1e9;
        }

        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                int t=(int)1e9;
                if(j-coins[i]>=0)
                    t=1+dp[i][j-coins[i]];

                int n=dp[i-1][j];
                dp[i][j]=Math.min(n,t);

            }
        }

        return dp[coins.length-1][amount] >= 1e9 ? -1 : dp[coins.length-1][amount];

    }

}