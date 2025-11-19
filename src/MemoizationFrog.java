class Solution {
    int minCost(int[] height) {
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        return rec(height,height.length-1,dp);

    }public static int rec(int []height, int index,int[]dp){
        if(index<=0)return 0;
        if(dp[index]!=-1)return dp[index];
        int left=Math.abs(height[index]-height[index-1])+rec(height,index-1,dp);
        int right=Integer.MAX_VALUE;
        if(index-2>=0)
            right=Math.abs(height[index]-height[index-2])+rec(height,index-2,dp);
        return dp[index]=Math.min(right,left);
    }
}