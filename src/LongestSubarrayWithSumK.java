class Solution {
    public int subarraySum(int[] arr, int k) {
        int sum=0;int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k)
                ans=Math.max(i+1,ans);

            else if(sum>k){
                if(map.containsKey(sum - k))
                    ans=Math.max(ans,i-map.get(sum-k));
            }
            map.put(sum,i);
        }
        return ans;


    }
}