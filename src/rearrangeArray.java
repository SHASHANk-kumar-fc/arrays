class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []ans=new int[nums.length];
        int x=0,y=1;
        int l=0;
        while(l<nums.length){
            if(nums[l]<0){
                ans[y]=nums[l];
                y+=2;
            }
            else{
                ans[x]=nums[l];
                x+=2;
            }
            l++;
        }return ans;
    }
}