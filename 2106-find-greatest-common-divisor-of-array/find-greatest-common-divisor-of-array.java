class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        int gcd = Math.min(small,large);
        while(gcd>0)
        {
            if (small % gcd == 0 && large % gcd == 0)
            {
                return gcd;
            }
            gcd--;
        }
        return 0;
    }
}