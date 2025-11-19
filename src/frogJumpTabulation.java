class Solution {
    int minCost(int[] height) {
        int dp[]=new int[height.length+1];
        Arrays.fill(dp,0);
        dp[0]=0;
        for(int i=1;i<height.length;i++){
            int left=Math.abs(height[i]-height[i-1])+dp[i-1];
            int right=Integer.MAX_VALUE;
            if(i-2>=0)
                right=Math.abs(height[i]-height[i-2])+dp[i-2];
            dp[i]=Math.min(right,left);
        }
        return dp[height.length-1];

    }
}