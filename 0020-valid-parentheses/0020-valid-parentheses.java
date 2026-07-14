class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!st.empty()&& st.peek()==map.get(s.charAt(i))){
                    st.pop();
                }
                else{
                    return false;
                }
            }
                else{
                    st.push(s.charAt(i));
                }

            }
            return st.isEmpty();
        }
        
    }

