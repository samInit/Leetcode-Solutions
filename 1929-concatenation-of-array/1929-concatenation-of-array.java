class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
  
            for(int j =0; j < n; j ++){
                ans[j] = nums[j];
                ans[n + j] = nums[j];
            }
            
     
        return ans;
        
    }
}