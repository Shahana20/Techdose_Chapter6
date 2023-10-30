class Solution {
    public int majorityElement(int[] nums) {
        int[] setBits = new int[32];
        int ele = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int num = nums[i];
            for(int j = 0 ; j < 32 ; j++)
            {
                if((num & ( 1 << j)) != 0)
                {
                    setBits[j]++;
                }
            }
        }
        for(int i = 0 ; i < 32 ; i++)
        {
            if(setBits[i] > (nums.length/2))
            {
                ele += (1 << i);
            }
        }
        return ele;
    }
}