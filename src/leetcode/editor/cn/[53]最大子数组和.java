
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp =new int[length];
        dp[0]=nums[0];
        for (int i = 1; i <length ; i++) {
            if ( dp[i-1]<=0) {
               dp[i]=nums[i];
            }else{
                dp[i]=dp[i-1]+nums[i];
            }
        }
        int maxsum = dp[0];
        for (int i = 1; i <length ; i++) {
            maxsum=Math.max(maxsum,dp[i]);
        }
        return maxsum;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
