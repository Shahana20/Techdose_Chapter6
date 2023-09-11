class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        if(n <= 1)
        {
            return 0;
        }
        if(n == 2)
        {
            return matches+1;
        }
        else if (n%2 == 0)
        {
            matches += n/2;
            n /= 2;
            return matches + numberOfMatches(n);
        }
        else if (n%2 != 0)
        {
            matches += ((n-1)/2);
            n = ((n-1)/2+1);
            return matches + numberOfMatches(n);
        }
        return 0;
    }
}