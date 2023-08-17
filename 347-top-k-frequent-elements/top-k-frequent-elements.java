class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(Integer i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int [] res = new int[k];
        int index=0;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        LinkedHashMap<Integer, Integer> sortedHashmap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedHashmap.put(entry.getKey(), entry.getValue());
        }
        for (Integer key : sortedHashmap.keySet())
        {
            res[index++]=key;
            if(index==k)
            break;
        }
        return res;
    }
}