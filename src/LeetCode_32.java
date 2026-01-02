class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[]{-1,-1};

        lower(nums,ans,target,0,nums.length-1);
        upper(nums,ans,target,0,nums.length-1);
        return ans;
    }public static void lower(int []nums,int ans[],int target,int l,int e){
        if(l>e)return ;
        int mid=(l+e)/2;
        if(nums[mid]>=target){
            if(nums[mid]==target)
                ans[0]=mid;
            lower(nums,ans,target,l,mid-1);
        }else lower(nums,ans,target,mid+1,e);

    }public static void upper(int []nums,int ans[],int target,int l,int e){
        if(l>e)return ;
        int mid=(l+e)/2;
        if(nums[mid]<=target){
            if(nums[mid]==target)
                ans[1]=mid;
            upper(nums,ans,target,mid+1,e);
        }else
            upper(nums,ans,target,l,mid-1);

    }
}