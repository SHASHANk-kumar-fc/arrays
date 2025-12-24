class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double [][]ans=new double[position.length][2];
        for(int i=0;i<n;i++){
            ans[i][0]=position[i];
            ans[i][1]=(double)(target-position[i])/speed[i];
        }Arrays.sort(ans,(a,b)-> Double.compare(b[0],a[0]));
        int count=0;double val=Double.MIN_VALUE;
        for(int i=0;i<n;i++){
            double pos=ans[i][0],time_needed=ans[i][1];
            if(val<time_needed){
                count++;
            }val=Math.max(val,time_needed);
        }return count;
    }
}