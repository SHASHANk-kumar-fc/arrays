class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        int[][]dp=new int[arr.length][sum+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(arr, dp, sum, arr.length-1) == 1;

    }
    public static int rec(int[]arr,int [][]dp,int sum,int i){
        if(sum==0)return 1;
        if(i<0 ||sum<0)return 0;

        if(dp[i][sum]!=-1)return dp[i][sum];
        if(rec(arr,dp,sum-arr[i],i-1)==1)return dp[i][sum]=1;
        else if(rec(arr,dp,sum,i-1)==1)return dp[i][sum]=1;
        else return dp[i][sum]=0;
    }
}