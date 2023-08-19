class Solution {
    public int findDay (int[] arr,int capacity)
    {
        int d=1;
        int load=0;
        for(int i=0;i<arr.length;i++)
        {
            if(load+arr[i]>capacity)
            {
                d++;
                load=arr[i];
            }
            else
            {
                load+=arr[i];
            }
        }
        return d;

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>max)
            {
                max=weights[i];
            }
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        int res=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int DaysReq = findDay(weights,mid);
            if(DaysReq<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}