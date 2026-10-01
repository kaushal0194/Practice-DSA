class Solution {
    void lpsfind(int[] lps,String needle){
        int pref=0;
        int suff=1;
        while(suff<needle.length()){
            if(needle.charAt(pref)==needle.charAt(suff)){
                lps[suff]=pref+1;
                suff++;
                pref++;
            }
            else{
                if(pref==0){
                    lps[suff]=0;
                    suff++;
                }
                else{
                    pref=lps[pref-1];
                }
            }
        }
    }

    public int strStr(String haystack, String needle) {
        int[] lps =new int[needle.length()];
        lpsfind(lps,needle);
        int first=0;
        int second=0;
        while(second<needle.length() && first<haystack.length()){
            if(needle.charAt(second)==haystack.charAt(first)){
                second++;
                first++;
            }
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
        }
        if(second==needle.length()){
            return first-second;
        }
        return -1;
        
    }
}