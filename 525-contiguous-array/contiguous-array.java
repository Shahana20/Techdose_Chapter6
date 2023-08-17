class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int sum=0;
        int res=0;
        freq.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]==0?-1:nums[i]);
            if(freq.containsKey(sum))
            {
                res=Math.max(res,i-freq.get(sum));
            }
            else{
                freq.put(sum,i);
            }
        }
        return res;
    }
}