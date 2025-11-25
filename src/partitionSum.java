class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0)return false;
        int[][]dp=new int[nums.length][sum/2+1];
        for(int i=0;i<nums.length;i++)Arrays.fill(dp[i],-1);
        return rec(nums,sum/2,nums.length-1,dp)==1;
    }
    public static int rec(int []nums,int target,int i,int[][]dp){
        if(target==0)return 1;
        int take=0;
        if(i<0)return 0;
        if(dp[i][target]!=-1)return dp[i][target];
        if(nums[i]<=target)
            take =rec(nums,target-nums[i],i-1,dp);
        int nottake=rec(nums,target,i-1,dp);
        return dp[i][target]=Math.max(take,nottake);
    }
}