class Solution {
    public String reverseWords(String s) {
        String newword=s.trim();
        String w="";
        String[] word=newword.split("\\s+");

        for(int i=word.length-1;i>=0;i--){
            
            if(i!=0)
            w+=word[i]+" "; 
            else{
                w+=word[i];
            }
        }

        return w;
    }
}