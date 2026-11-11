class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        int[] occ = new int[s.length()];
        int top = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                occ[top] = i;
                top++;
            }
        }

        int p = 0;

        for(int i = 0; i < s.length(); i++) {

            while(p + 1 < top &&
                  Math.abs(i - occ[p]) >= Math.abs(i - occ[p+1])) {
                p++;
            }

            arr[i] = Math.abs(i - occ[p]);
        }

        return arr;
    }
}