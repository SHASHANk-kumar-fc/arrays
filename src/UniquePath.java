class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return rec(m-1,n-1,dp) ;


    }
    public static int rec(int r,int c,int dp[][]){
        if(r==0 && c==0){
            return 1;
        }
        if(r<0 ||c<0)return 0;
        if(dp[r][c]!=-1)return dp[r][c];
        int left=rec(r,c-1,dp);
        int up =rec(r-1,c,dp);
        return dp[r][c]=left+up;
    }
}