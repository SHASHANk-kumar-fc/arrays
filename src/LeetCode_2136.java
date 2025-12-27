class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int sum=0;int i=0,n=growTime.length;
        int ans[][]=new int[n][2];
        for(int j=0;j<n;j++){
            ans[j][0]=plantTime[j];
            ans[j][1]=growTime[j];
        }
        Arrays.sort(ans,(a,b)->b[1]-a[1]);
        int prev=0,max=0;
        while(i<n) {
            sum=prev+ans[i][1]+ans[i][0];
            max=Math.max(max,sum);
            prev+=ans[i][0];i++;
        }
        return max;
    }
}