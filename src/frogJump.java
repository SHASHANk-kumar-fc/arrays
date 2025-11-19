class Solution {
    public int frogJump(int[] height, int k) {
        return rec(height,k,height.length-1);
    }
    public static int rec(int[] height,int k,int n){
        if(n<=0)return 0;
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int result=Math.abs(height[n]-height[n-i])+rec(height,k,n-i);
                res=Math.min(res,result);}
        }return res;
    }
}