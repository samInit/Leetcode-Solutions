class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];
        int len = s.length();
        for(int i = 0; i < len; ++i) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int maxLen = 0;
        int curCost = 0;
        int start = 0;

        for(int end = 0; end < diff.length; ++end) {
            curCost += diff[end];
            while(curCost > maxCost) {
                curCost -= diff[start];
                ++start;
            }
         maxLen = Math.max(maxLen, end - start + 1);
    }
    
    return maxLen;
    }
}

