class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1)return "";
        char[] arr = palindrome.toCharArray();
        int l=0;


        while(l<palindrome.length()/2){
            if(palindrome.charAt(l)!='a'){
                arr[l]='a';break;
            }l++;
        }
        if(l==palindrome.length()/2){
            if(arr[palindrome.length()-1]!='a')
                arr[palindrome.length()-1]='a';
            else arr[palindrome.length()-1]='b';}

        String s=new String(arr);
        return s;
    }
}