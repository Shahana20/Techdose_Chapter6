class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence : sentences)
        {
            int wordCount = 1;
            for(int character = 1 ; character < sentence.length() ; character++)
            {
                if(sentence.charAt(character-1)==' ')
                {
                    wordCount++;
                }
            }
            if(wordCount > maxWords)
            {
                maxWords = wordCount;
            }
        }
        return maxWords;
    }
}