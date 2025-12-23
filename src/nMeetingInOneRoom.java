class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        int n=start.length,count=0;
        int [][] meeting=new int[n][2];
        for(int i=0;i<n;i++){
            meeting[i][0]=start[i];
            meeting[i][1]=end[i];
        }
        Arrays.sort(meeting,(a,b)-> a[1]-b[1]);int val=-1;
        for(int i=0;i<n;i++){
            int s=meeting[i][0],e=meeting[i][1];
            if(s>val){
                count++;val=e;
            }
        }
        return count;
    }
}
