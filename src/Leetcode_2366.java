class Solution {
public long minimumReplacement(int[] nums) {
    int prev=nums[nums.length-1];
    long count=0;

    for(int i=nums.length-2;i>=0;i--){
        if(prev<nums[i]){
            int k=(nums[i]+prev-1)/prev;
            count+=k-1;
            prev=nums[i]/k;
        }else{
            prev=nums[i];
        }
    }

    return count;
}
}