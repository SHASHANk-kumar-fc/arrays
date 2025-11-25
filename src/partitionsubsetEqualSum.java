class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if(sum%2!=0)return false;
        sum=sum/2;
        int[][]dp=new int[nums.length][sum+1];
        for(int i=0;i<nums.length;i++)dp[i][0]=1;
        if(nums[0]<=sum)
            dp[0][nums[0]]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=sum;j++){
                int take=0;
                if(nums[i]<=j)
                    take =dp[i-1][j-nums[i]];
                int nottake=dp[i-1][j];
                dp[i][j]=Math.max(take,nottake);
            }
        }
        return dp[nums.length-1][sum]==1;
    }

}