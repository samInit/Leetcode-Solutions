class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray_s = s.toCharArray();
        Arrays.sort(charArray_s);
        String sortedString_s = new String(charArray_s);
        
        char[] charArray_t = t.toCharArray();
        Arrays.sort(charArray_t);
        String sortedString_t = new String(charArray_t);
        
        int len_s = s.length();
        int len_t = t.length();
         if (len_t != len_s) {
             return false; 
        }
        for (int i = 0; i < len_s; i++) {
            if (sortedString_s.charAt(i) != sortedString_t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}