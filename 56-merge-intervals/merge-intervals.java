class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List <int[]> res = new ArrayList<>();
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        for(int [] i :intervals)
        {
            if(i[0]<=currEnd)
            {
                currEnd=Math.max(currEnd,i[1]);
            }
            else
            {
                res.add(new int[]{currStart,currEnd});
                currStart=i[0];
                currEnd=i[1];
            }
        }
        res.add(new int[] {currStart,currEnd});
        return res.toArray(new int[0][]);
    }
}