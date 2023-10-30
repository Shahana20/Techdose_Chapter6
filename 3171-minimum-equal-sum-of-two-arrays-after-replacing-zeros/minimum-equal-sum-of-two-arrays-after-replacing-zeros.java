class Solution {
    public long findSum(int[] arr)
    {
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    
    public int findZeroes(int[] arr)
    {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    public long minSum(int[] nums1, int[] nums2) {
        
        long sum1 = findSum(nums1);
        long sum2 = findSum(nums2);
        int zeroCount1 = findZeroes(nums1);
        int zeroCount2 = findZeroes(nums2);
        long totalSum1 = sum1 + zeroCount1;
        long totalSum2 = sum2 + zeroCount2;

        // System.out.println(sum1+" "+sum2);

        if(totalSum1 > totalSum2)
        {
            if(zeroCount2 == 0)
            {
                return -1;
            }
        }
        if(totalSum2 > totalSum1)
        {
            if(zeroCount1 == 0)
            {
                return -1;
            }
        }
        // System.out.println(totalSum1+" "+totalSum2);
        return Math.max(totalSum1 , totalSum2);
    }
}