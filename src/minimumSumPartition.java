class Solution {

    public int minDifference(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++)sum+=arr[i];
        int dp[][]=new int[arr.length][sum+1];
        for(int i=0;i<arr.length;i++)dp[i][0]=1;
        if(arr[0]<=sum)dp[0][arr[0]]=1;
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=sum;j++){
                int t=0;
                if(j-arr[i]>=0)
                    t=dp[i-1][j-arr[i]];
                int n=dp[i-1][j];
                dp[i][j]=Math.max(t,n);
            }
        }int mini=Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++){
            if(dp[arr.length-1][i]==1){
                mini=Math.min(mini,Math.abs(sum-(2*i))) ;
            }
        }return mini;
    }
}
