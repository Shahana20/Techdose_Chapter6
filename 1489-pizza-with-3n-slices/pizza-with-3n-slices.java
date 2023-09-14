class Solution {
    int[][] memo;
    public int maxSizeSlices(int[] slices) 
    {
        int n = slices.length;
        memo = new int[n+1][n/3+1];
        
        for(int[] x: memo)
            Arrays.fill(x, -1);
        
        int x1 = find(slices, 1, n-1, n/3);
        
        for(int[] x: memo)
            Arrays.fill(x, -1);
        
        int x2 = find(slices, 2, n, n/3);
        return Math.max(x1, x2);
    }
    
    public int find(int[] slices, int i, int n, int count)
    {
        if(i>n || count==0)
            return 0;
        
        if(memo[i][count]!=-1)
            return memo[i][count];
        
        int x1 = slices[i-1] + find(slices, i+2, n, count-1);
        int x2 = find(slices, i+1, n, count);
        
        return memo[i][count] = Math.max(x1, x2);
    }
}