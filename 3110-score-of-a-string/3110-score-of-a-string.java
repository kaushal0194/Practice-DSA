class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)>0){
            score+=s.charAt(i)-s.charAt(i-1);
            }
        
        else{
            score+=s.charAt(i-1)-s.charAt(i);
        }
        }
        return score;
    }
}