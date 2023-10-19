class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int [nums.length];
        int [] rightSum = new int [nums.length];
        int [] answer = new int [nums.length];
        int left = 0;
        int right = 0;
        leftSum[0] = 0;
        for(int i = 1 ; i < nums.length ; i++)
        {
            left += nums[i - 1];
            leftSum[i] =  left;
        }

        rightSum[nums.length - 1] = 0;
        for(int i = nums.length - 2 ; i >=0 ; i--)
        {
            right += nums[i + 1];
            rightSum[i] = right;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;

    }
}