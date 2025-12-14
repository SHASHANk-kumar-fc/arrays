class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        if((target+sum)%2!=0 || Math.abs(target)>sum)return 0;
        sum=(target+sum)/2;
        int dp[][]=new int [nums.length][sum+1];
        for(int i=0;i<nums.length;i++)Arrays.fill(dp[i],-1);

        return rec(nums,sum,nums.length-1,dp);
    }
    public static int rec(int []nums,int target,int i,int [][]dp){
        if(i==0){
            if(target==0 &&nums[i]==0)return 2;
            if(target==0 ||target-nums[i]==0)return 1;
            return 0;
        }if(dp[i][target]!=-1)return dp[i][target];
        int t=0;
        if(target-nums[i]>=0)
            t=rec(nums,target-nums[i],i-1,dp);
        int n=rec(nums,target,i-1,dp);
        return dp[i][target]= t+n;
    }
}