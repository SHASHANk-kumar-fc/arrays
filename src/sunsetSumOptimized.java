class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        int[] dp = new int[sum + 1];


        dp[0]=1;
        if(arr[0]<=sum)
            dp[arr[0]]=1;
        for(int i=1;i<arr.length;i++){
            int temp[]=new int[sum+1];
            temp[0]=1;
            for(int j=1;j<=sum;j++){
                boolean take=false;
                if(arr[i]<=j)
                    take=dp[j-arr[i]]==1;

                boolean nottake=dp[j]==1;
                if(take||nottake)temp[j]=1;
                else temp[j]=0;
            }dp=temp.clone();
        }
        return dp[sum] == 1;
    }


}
