class Solution {
    public String makeString(Character ch,Integer key)
    {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<key;i++)
        {
            str.append(ch);
        }
        return str.toString();
    }


    public String frequencySort(String s) {
        String res="";
        HashMap <Character,Integer> freq = new HashMap<>();
        for(Character ch : s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        LinkedHashMap<Character, Integer> sortedHashmap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedHashmap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : sortedHashmap.entrySet())
        {
            res+=makeString(entry.getKey(),entry.getValue());
        }
        return res;
    }
}