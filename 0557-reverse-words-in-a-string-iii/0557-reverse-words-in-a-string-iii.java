class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String s1 = "";
        for (int i = 0; i < words.length; i++) {
            char[] a = words[i].toCharArray();
            int left = 0;
            int right = a.length - 1;
            while (left < right) {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            
            if (i < words.length - 1) {
                for (int j = 0; j < a.length; j++) {
                    s1 += a[j];
                }
                s1 += " ";
            } else {
                for (int j = 0; j < a.length; j++) {
                    s1 += a[j];
                }
            }

        }
return s1;
    }
}