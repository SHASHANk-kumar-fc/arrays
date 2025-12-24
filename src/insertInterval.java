class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0 )return new int[][]{newInterval};
        List<int[]>  l=new ArrayList<>();
        // finding the left one
        int s=newInterval[0],e=newInterval[1];
        int i=0;
        while(i<intervals.length &&intervals[i][1]<s){
            l.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        //Middle
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }l.add(new int[]{newInterval[0],newInterval[1]});
        //leftout
        while(i<intervals.length){
            l.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }int ans[][]=new int[l.size()][2];
        for(int in=0;in<l.size();in++){
            ans[in][0]=l.get(in)[0];
            ans[in][1]=l.get(in)[1];
        }
        return ans;
    }
}