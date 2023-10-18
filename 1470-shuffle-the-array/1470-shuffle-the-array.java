class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] formnew = new int[2*n];
        for (int i = 0; i < n; i++) {
            formnew[2 * i] = nums[i];
            formnew[2 * i + 1] = nums[n + i];
        }
        return formnew;
        
    }
}