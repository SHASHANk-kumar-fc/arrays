class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n=deadline.length;
        int [][]job=new int[n][2];
        int max=0;
        for(int i=0;i<n;i++){
            job[i][0]=deadline[i];
            job[i][1]=profit[i];
            max=Math.max(max,deadline[i]);
        }
        Arrays.sort(job, (a, b) -> b[1] - a[1]);
        boolean seq[]=new boolean[max+1];
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            for(int j=job[i][0];j>0;j--)
                if(!seq[j]){
                    seq[j]=true;
                    sum+=job[i][1];count++;
                    break;
                }
        }
        ArrayList<Integer>  a=new ArrayList<>();
        a.add(count);
        a.add(sum);
        return a;
    }
}