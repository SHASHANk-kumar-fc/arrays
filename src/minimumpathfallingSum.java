class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;

        int dp[]=new int[c];
        for(int i=0;i<c;i++)dp[i]=matrix[0][i];
        for(int i=1;i<r;i++) {
            int temp[]=new int[c];
            for(int j=0;j<c;j++){
                int up=Integer.MAX_VALUE,left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
                //up

                up=dp[j];
                //left
                if( j-1>=0)
                    left=dp[j-1];
                if(j+1<c)
                    right=dp[j+1];
                temp[j]=matrix[i][j]+Math.min(up,Math.min(left,right));
            }dp=temp.clone();

        }int min = Integer.MAX_VALUE;
        for (int j = 0; j < c; j++) {
            min = Math.min(min, dp[j]);
        }

        return min;
    }

}