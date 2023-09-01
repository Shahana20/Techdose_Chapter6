class Solution {
    public int[] countBits(int n) {
        int []num=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                num[i]=num[i-1]+1;
            }
            else
            {
                num[i]=num[i>>1];
            }
        }
        return num;
    }
}