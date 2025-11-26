class Solution {
    public int perfectSum(int[] nums, int target) {
        int dp[][]=new int [nums.length][target+1];
        Arrays.fill(dp[0],0);
        if(nums[0]<=target)dp[0][nums[0]]=1;
        dp[0][0]=nums[0]==0?2:1;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<=target;j++){
                int take=0;
                if(j-nums[i]>=0)
                    take=dp[i-1][j-nums[i]];
                int n=dp[i-1][j];
                dp[i][j]=take+n;
            }
        }
        return dp[nums.length-1][target];
    }
}