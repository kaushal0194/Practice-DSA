class Solution {
    public int compress(char[] chars) {
        int index=0;
        String s="";
        
        while(index<chars.length){
            char ch=chars[index];
            int count=0;
            while(index<chars.length && chars[index]==ch){
                count++;
                index++;
            }
            
            if(count>1){
                s+=ch;
                s+=count;
            }
            else{
                s+=ch;
            }

            
        }
                for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}