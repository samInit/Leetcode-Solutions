class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int len = trimmed.length();
        char[] arr = trimmed.toCharArray();
        int count = 0;
        int i = len-1;
        while(i>=0 && !Character.isWhitespace(arr[i])){
            count++;
            i--;
        }
        return count;
    }
}