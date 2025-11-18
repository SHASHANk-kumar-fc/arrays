class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int one=dp[i-1];
            if(i-2>=0)
                one+=dp[i-2];
            dp[i]=one;
        }
        return dp[n];

    }

}