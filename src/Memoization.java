class Solution {
    public int frogJump(int[] height, int k) {
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        return rec(height,k,height.length-1,dp);
    }
    public static int rec(int[] height,int k,int n,int[] dp){
        if(n<=0)return 0;
        if(dp[n]!=-1)return dp[n];
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int result=Math.abs(height[n]-height[n-i])+rec(height,k,n-i,dp);
                res=Math.min(res,result);}
        }return dp[n]=res;
    }
}