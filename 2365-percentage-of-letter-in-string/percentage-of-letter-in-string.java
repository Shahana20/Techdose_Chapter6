class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(Character ch : s.toCharArray())
        {
            if(ch == letter)
            {
                count++;
            }
        }
        
        return (int)Math.ceil(count * 100 / s.length());
    }
}