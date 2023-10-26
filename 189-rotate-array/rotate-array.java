class Solution {
    public void swap(int[] nums , int start , int index)
    {
        int temp = nums[start];
        nums[start] = nums[index];
        nums[index] = temp;
    }

    public void reverse(int[] nums , int i ,int j)
    {
        while(i < j)
        {
            swap(nums , i , j);
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k)
    {
        k = k % nums.length;
        reverse(nums , 0 , nums.length - 1);
        reverse(nums , 0 , k - 1);
        reverse(nums , k , nums.length - 1);
        
    }
}