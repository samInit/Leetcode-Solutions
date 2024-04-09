class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int miss = 0;
        int len = nums.length;
        for(int i=0; i< len; i+=2){
            if(i< nums.length-1 && nums[i]!=nums[i+1]){
                miss = nums[i];
                break;
            }
            else{
                miss = nums[len-1];
            }
        }
        return miss;
    }
}