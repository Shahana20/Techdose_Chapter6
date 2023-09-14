class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            int rev = 0;
            while(i!=0){
                rev = rev*10+i%10;
                i/=10;
            }
            map.put(rev, map.getOrDefault(rev, 0)+1);
        }
        return map.size();
    }
}