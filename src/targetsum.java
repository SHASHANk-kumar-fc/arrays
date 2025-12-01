class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        if((target+sum)%2!=0 || Math.abs(target)>sum)return 0;
        sum=(target+sum)/2;
        int dp[][]=new int[nums.length][Math.abs(sum)+1];
        dp[0][0]=1;
        if(nums[0]<=sum)
            dp[0][nums[0]]=1;if(nums[0]==0 )dp[0][0]=2;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<sum+1;j++){
                int t=0;
                if(j-nums[i]>=0)
                    t=dp[i-1][j-nums[i]];
                int  n=dp[i-1][j];
                dp[i][j]=n+t;
            }
        }
        return dp[nums.length-1][sum];
    }
}