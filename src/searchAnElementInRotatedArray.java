class Solution {
    public int search(int[] nums, int target) {
        int e=nums.length-1;
        int l=0;
        while(l<=e){
            int mid=(l+e)/2;
            if(nums[mid]==target)return mid;
            else{
                if(nums[l]<=nums[mid]){
                    if(target<=nums[mid] &&nums[l]<=target)
                        e=mid-1;
                    else l=mid+1;
                }
                else{
                    if(target>=nums[mid] &&target<=nums[e])
                        l=mid+1;
                    else e=mid-1;
                }
            }
        }return -1;
    }
}