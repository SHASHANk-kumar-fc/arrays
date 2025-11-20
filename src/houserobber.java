class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int rob=Integer.MIN_VALUE;
            if(i-2>=0)
                rob=nums[i]+dp[i-2];
            dp[i]=Math.max(rob,dp[i-1]);
        }
        return dp[nums.length-1];
    }
}