class Solution {
    public int frogJump(int[] height, int k) {
        int dp[]=new int[height.length];
        Arrays.fill(dp,0);
        dp[0]=0;
        for(int i=1;i<height.length;i++){
            int j=1,res=Integer.MAX_VALUE;
            while(j<=k){
                if(i-j>=0){
                    int result=Math.abs(height[i]-height[i-j])+dp[i-j];
                    res=Math.min(res,result);
                }j++;
            }dp[i]=res;
        }
        return dp[height.length-1];
    }
}