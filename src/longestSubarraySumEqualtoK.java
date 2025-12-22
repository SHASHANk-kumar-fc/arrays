class Solution {
    public int longestSubarray(int[] arr, int k) {
        int l=0,r=0;int sum=0,max=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l++];
            }
            max=Math.max(max,r-l+1);r++;
        }
        return max;
    }
}
