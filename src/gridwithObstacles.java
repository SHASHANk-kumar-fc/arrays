class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length,c=obstacleGrid[0].length;
        if(r==1 && c==1 && obstacleGrid[r-1][c-1]==1)return 0;
        int dp[][]=new int[r][c];
        dp[0][0]=(obstacleGrid[0][0]==0)?1:0;
        for(int i=0;i<r;i++){
            int j=(i==0)?1:0;
            while(j<c){
                if(obstacleGrid[i][j]!=1){
                    if(i-1>=0)         //up
                    {
                        dp[i][j]+=dp[i-1][j];
                    }
                    if(j-1>=0){
                        dp[i][j]+=dp[i][j-1];
                    }
                }
                else dp[i][j]=0;j++;
            }
        }
        return dp[r-1][c-1];
    }

}