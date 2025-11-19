class Solution {
    int minCost(int[] height) {
        int dp[]=new int[height.length+1];
        Arrays.fill(dp,0);
        int a=0,b=0;
        dp[0]=0;
        for(int i=1;i<height.length;i++){
            int left=Math.abs(height[i]-height[i-1])+a;
            int right=Integer.MAX_VALUE;
            if(i-2>=0)
                right=Math.abs(height[i]-height[i-2])+b;
            b=a;
            a=Math.min(right,left);

        }
        return a;

    }
}