class Solution {

    public int perfectSum(int[] nums, int target) {
        int dp[][]=new int [nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(nums,target,nums.length-1,dp);

    }
    public static int rec(int[]nums,int target,int i,int [][]dp){
        if(i<0)return target==0?1:0;


        if(dp[i][target]!=-1)return dp[i][target];
        int take=0;

        if(target-nums[i]>=0)
            take=rec(nums,target-nums[i],i-1,dp);

        int nottake=rec(nums,target,i-1,dp);
        return dp[i][target]=take+nottake;
    }
}