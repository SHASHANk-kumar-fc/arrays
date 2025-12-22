class Solution {
    public void nextPermutation(int[] nums) {
        int r=nums.length-1 ;
        while(r>0){
            if(nums[r]>nums[r-1])break;
            r--;
        }
        if(r-1<0)rev(nums,0,nums.length);
        else{int val=r-1,min=Integer.MAX_VALUE, index=val+1;
            while(r<nums.length){
                if(min>=nums[r] &&nums[r]>nums[val]){
                    min=nums[r];index=r;}r++;
            }swap(nums,index,val);
            rev(nums,val+1,nums.length);

        }
    }
    public static void rev(int nums[],int i,int j){
        int l = i, r = j - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }}
    public static void swap(int []nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;

    }
}