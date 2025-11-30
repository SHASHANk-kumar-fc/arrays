class Solution {
    public int countPartitions(int[] arr, int diff) {

        int sum=0;
        for(int i=0;i<arr.length;i++)sum+=arr[i];
        if((sum-diff)%2!=0 ||diff>sum)return 0;
        int subset=(sum-diff)/2;
        int dp[][]=new int[arr.length][subset+1];
        dp[0][0]=1;
        if(arr[0]<=subset)
            dp[0][arr[0]]=1;
        if(arr[0]==0 )dp[0][0]=2;

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<=subset;j++){
                int t=0;
                if(arr[i]<=j)
                    t=dp[i-1][j-arr[i]];
                int n=dp[i-1][j];
                dp[i][j]=n+t;
            }
        }
        return dp[arr.length-1][subset];
    }
}
