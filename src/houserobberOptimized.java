class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int b = nums[0];
        int a=0;
        for(int i=1;i<nums.length;i++){
            int rob=Integer.MIN_VALUE;
            if(i-2<0)rob=nums[i];
            else
                rob=nums[i]+a;
            a=b;
            b=Math.max(rob,b);
        }
        return b;
    }
}