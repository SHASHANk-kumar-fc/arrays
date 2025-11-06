class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1)return nums.length;
        int l=0;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[l])
            {l++;
                nums[l]=nums[i];

            }
        }return l+1;
    }
}