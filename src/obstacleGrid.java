class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length,c=obstacleGrid[0].length;
        if(r==1 && c==1 && obstacleGrid[r-1][c-1]==1)return 0;
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(dp,obstacleGrid,r-1,c-1);
    }
    public static int rec(int[][]dp,int [][]arr,int r,int c){

        if(r<0 ||c<0 ||arr[r][c]==1)return 0;
        if(r==0 &&c==0)return 1;
        if(dp[r][c]!=-1)return dp[r][c];
        return dp[r][c]=rec(dp,arr,r,c-1)+rec(dp,arr,r-1,c);
    }
}