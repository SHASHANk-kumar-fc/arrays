class Solution {
    public int climbStairs(int n) {

        int prev1=1,prev2=0;
        for(int i=1;i<=n;i++){
            int left=prev1;
            if(i-2>=0)
                left+=prev2;
            prev2=prev1;
            prev1=left;
        }
        return prev1;

    }

}