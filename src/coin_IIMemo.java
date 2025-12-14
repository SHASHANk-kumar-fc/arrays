class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int [coins.length][amount+1];
        for(int i=0;i<coins.length;i++)Arrays.fill(dp[i],-1);
        return rec(amount,coins,coins.length-1,dp);
    }
    public static int rec(int target,int []coins,int i,int[][]dp){
        if(i==0){
            if(target%coins[i]==0 )return 1;
            return 0;
        }if(dp[i][target]!=-1)return dp[i][target];
        int t=0;
        if(target-coins[i]>=0)
            t=rec(target-coins[i],coins,i,dp);
        int n=rec(target,coins,i-1,dp);
        return dp[i][target]=t+n;
    }
}