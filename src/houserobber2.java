class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int []dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int c=rec(nums,nums.length-2,dp,0);
        Arrays.fill(dp,-1);
        int b=rec(nums,nums.length-1,dp,1);
        return Math.max(c,b);
    }public static int rec(int []nums,int n,int[]dp,int start){
        if(n==start)return nums[n];
        if(n<start)return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=nums[n]+rec(nums,n-2,dp,start);
        int not_pick=0+rec(nums,n-1,dp,start);
        return dp[n]=Math.max(pick,not_pick);
    }
}