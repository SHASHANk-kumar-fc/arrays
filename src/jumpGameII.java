class Solution {
    public int jump(int[] nums) {
        int l=0,r=0,count=0;
        while(r<nums.length-1){
            int x=0;int index=l;
            while(index<=r){
                x=Math.max(x,nums[index]+index);
                index++;
            }l=r+1;
            r=x;
            count++;

        }return count;
    }
}