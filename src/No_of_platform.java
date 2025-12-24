class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max=0,l=0,r=0;
        while(l<n &&r<n){
            if(arr[l]<=dep[r]){
                l++;count++;
            }
            else if(arr[l]>dep[r]) {
                r++;count--;
            }


            max=Math.max(count,max);
        }
        return max;
    }
}

