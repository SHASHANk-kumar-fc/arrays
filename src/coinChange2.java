class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];


        for(int j=0;j<=amount;j++){
            dp[0][j] = (j % coins[0] == 0) ? 1 : 0;
        }

        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                int t=0;
                if(j-coins[i]>=0)
                    t=dp[i][j-coins[i]];
                int n=dp[i-1][j];
                dp[i][j]=t+n;
            }
        }
        return dp[coins.length-1][amount];
    }
    public static int rec(int [][]dp,int i,int amount,int[] coins ){
        if(i==0){

            if(amount%coins[i]==0)return 1;

            else return 0;
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int t=0;
        if(amount-coins[i]>=0)
            t=rec(dp,i,amount-coins[i],coins);
        int n=rec(dp,i-1,amount,coins);
        return dp[i][amount]=t+n;
    }
}