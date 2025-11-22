class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min=Integer.MAX_VALUE;
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++)
            Arrays.fill(dp[i],-1);
        for(int i=triangle.get(triangle.size()-1).size()-1;i>=0;i--)
            min=Math.min(min,rec(triangle,triangle.size()-1,i,dp));
        return min;
    }
    public static int rec(List<List<Integer>>l,int r,int c,int[][]dp){
        if(r==0 &&c==0)return l.get(r).get(c);
        if(r<0||c<0||l.get(r).size()<c+1)return Integer.MAX_VALUE;
        if(dp[r][c]!=-1)return dp[r][c];
        int diagonal=rec(l,r-1,c-1,dp);
        int up=rec(l,r-1,c,dp);
        return dp[r][c]=l.get(r).get(c)+Math.min(diagonal,up);
    }
}