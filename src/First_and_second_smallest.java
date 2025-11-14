class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        if(arr.length==1) return new ArrayList<>(Arrays.asList(-1));
        int min=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                sec=min;
                min=arr[i];}
            else if( arr[i]!=min && sec>arr[i])
                sec=arr[i];
        }
        if(sec==min ||sec==Integer.MAX_VALUE)
            return new ArrayList<>(Arrays.asList(-1));
        return new ArrayList<>(Arrays.asList(min, sec));
    }
}
