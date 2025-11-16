class Solution {
    public int majorityElement(int[] nums) {
        int frequency=1,num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num)
                frequency++;
            else{  frequency--;
                if(frequency==0){
                    num=nums[i];frequency=1;
                }}
        }return num;
    }
}