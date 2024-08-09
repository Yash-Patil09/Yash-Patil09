class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int max_end = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            max_end = Math.max(nums[i], max_end + nums[i]);

            max_sum = Math.max(max_sum,max_end);
        }
        return max_sum;
        
    }
}