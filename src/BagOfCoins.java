class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens)  ;int maxScore=0,score=0,r=tokens.length-1;
        int l=0;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                l++;score++;
            }else if(score>0){
                power+=tokens[r];
                r--;score--;
            }else break;
            maxScore=Math.max(maxScore,score);}
        return maxScore;
    }
}