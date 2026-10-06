class Solution {

    String stringMaking(String ans,int n){
        if(n==1){
            return ans;
        }
        String temp="";
        int r=0;

        while(r<ans.length()){
            int count=1;

            while(r+1<ans.length() && ans.charAt(r)==ans.charAt(r+1)){
                r++;
                count++;
            }
            temp+=count;
            temp+=ans.charAt(r);
            r++;

        }


        return stringMaking(temp,n-1);

    }
    public String countAndSay(int n) {

        return stringMaking("1",n);

        
    }
}