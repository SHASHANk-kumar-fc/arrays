class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int [coins.length][amount+1];
        for(int i=0;i<coins.length;i++)Arrays.fill(dp[i],-1);
        int r= rec(coins,amount,coins.length-1,dp);
        if(r==(int)1e9)return -1;
        return r;
    }
    public static int rec(int []nums,int target,int i,int[][]dp){
        if(i==0){
            if(target%nums[i]==0)
                return target/nums[i];
            return (int)1e9;
        }if(dp[i][target]!=-1)return dp[i][target];
        int t=(int)1e9;
        if(target-nums[i]>=0)
            t=1+rec(nums,target-nums[i],i,dp);
        int n=rec(nums,target,i-1,dp);
        return dp[i][target]= Math.min(t,n);
    }
}