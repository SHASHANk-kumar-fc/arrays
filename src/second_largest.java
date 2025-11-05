class Solution {
    public int getSecondLargest(int[] arr) {
        int max=arr[0],second=-1;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                second=max;
                max=arr[i];
            }else if(max!=arr[i]&& second<arr[i]){
                second=arr[i];
            }
        }return second;
    }
}