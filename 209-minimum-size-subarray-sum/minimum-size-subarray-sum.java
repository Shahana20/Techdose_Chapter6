class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=nums[left];
        int minLength = Integer.MAX_VALUE;
        while (right < nums.length) {
            if (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            } else {
                right++;
                if (right < nums.length) {
                    sum += nums[right];
                }
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
   