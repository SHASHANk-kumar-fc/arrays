class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans[]  =new int []{nums.length};
        index(ans,nums,0,ans[0]-1,target);
        return ans[0];
    }
    public static void index(int[] ans,int []nums,int l,int r,int k){
        if(l>r)return;
        int mid=(l+r)/2;
        if(nums[mid]==k){
            ans[0]=mid;
            return;
        }
        else if(nums[mid]>k){
            ans[0]=mid;
            index(ans,nums,l,mid-1,k);}
        else
            index(ans,nums,mid+1,r,k);
    }
}