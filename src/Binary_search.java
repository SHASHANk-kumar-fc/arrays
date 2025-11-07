class Solution {
    public int search(int[] nums, int target) {
        return index(nums,0,nums.length-1,target);
    }
    public static int index(int []nums,int l,int r,int k){
        if(l>r)return -1;
        int mid=(l+r)/2;
        if(nums[mid]==k)
            return mid;
        else if(nums[mid]>k)
            return index(nums,l,mid-1,k);
        else
            return index(nums,mid+1,r,k);
    }
}