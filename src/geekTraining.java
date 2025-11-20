class Solution {
    public int maximumPoints(int arr[][]) {
        int r=arr.length,c=arr[0].length;
        int res=Integer.MIN_VALUE;
        int dp[][]=new int [r][c];
        for(int i=0;i<r;i++)Arrays.fill(dp[i],-1);
        for(int i=0;i<c;i++){
            int ans=arr[r-1][i]+ rec(arr,r-2,i,dp);
            res=Math.max(ans,res) ;}
        return res;
    }
    public static int rec(int [][]arr,int i,int last,int[][]dp){
        if(i<0)return 0;
        if(dp[i][last]!=-1)return dp[i][last];
        int res=Integer.MIN_VALUE;
        for(int in=0;in<arr[0].length;in++){
            if(in!=last ){
                int ans=arr[i][in]+rec(arr,i-1,in,dp);
                res=Math.max(ans,res);}
        }return dp[i][last]= res;
    }
}