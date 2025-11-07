class Solution {
    int upperBound(int[] arr, int target) {
        int ans[]=new int[]{arr.length};
        index(arr,ans,target,0,ans[0]-1);
        return ans[0];
    }public static void index(int[]arr,int[] ans,int k,int l,int r){
        if(l>r)return;
        int mid=(l+r)/2;
        if(arr[mid]>k){
            ans[0]=mid;
            index(arr,ans,k,l,mid-1);
        }else {
            index(arr,ans,k,mid+1,r);
        }
    }
}
