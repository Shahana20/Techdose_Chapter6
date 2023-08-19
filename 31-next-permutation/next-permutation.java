class Solution {
    public void swap(int[] A,int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    
    public void reverse(int []A,int i,int j)
    {
        while(i<j)
        {
            swap(A,i++,j--);
        }
    }


    public void nextPermutation(int[] nums) {
        if(nums.length<=1)
        {
            return;
        }
        int breakPoint = nums.length-2;
        while(breakPoint >= 0 && nums[breakPoint] >= nums[breakPoint+1])
        {
            breakPoint--;
        }
        if(breakPoint>=0)
        {
            int swapElement = nums.length-1;
            while(nums[swapElement]<=nums[breakPoint])
            {
                swapElement--;
            }
            swap(nums,breakPoint,swapElement);
        }
    reverse(nums,breakPoint+1,nums.length-1);
    
    }
    
}