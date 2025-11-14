class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }int x=0;
        for(Integer key : map.keySet()){
            nums[x++]=key;
        }Arrays.sort(nums,0,x);
        return x;
    }
}