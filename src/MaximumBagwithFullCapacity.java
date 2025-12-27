class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int ans[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=capacity[i];
            ans[i][1]=capacity[i]-rocks[i];
        }
        Arrays.sort(ans,(a,b)->
                (a[1]-b[1]));
        int count=0;
        for(int i=0;i<n;i++){

            if(additionalRocks>=ans[i][1]){
                count++;
                additionalRocks-=ans[i][1];
            }

        }return count;
    }
}