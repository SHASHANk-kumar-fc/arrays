class Solution {
    public int partitionString(String s) {
        if(s.length()==0)return 0;
        int count=0,scs=0;
        int arr[]=new int[26];Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++)  {
            if( arr[s.charAt(i)-'a']>=scs)
            {count++;
                scs=i;
            }arr[s.charAt(i)-'a']=i;
        }return count+1;
    }
}