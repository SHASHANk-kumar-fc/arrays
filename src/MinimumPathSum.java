class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int dp[][]=new int [r][c];
        for(int i=0;i<r;i++)Arrays.fill(dp[i],-1);
        return rec(dp,grid,r-1,c-1);
    }
    public static int rec(int dp[][],int grid[][],int r,int c){
        if(r==0 && c==0)return grid[r][c];
        if(r<0 ||c<0)return Integer.MAX_VALUE;
        if(dp[r][c]!=-1)return dp[r][c];
        int left=rec(dp,grid,r,c-1);
        int up=rec(dp,grid,r-1,c);
        return dp[r][c]=grid[r][c]+Math.min(left,up);
    }
}