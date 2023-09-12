class Solution {
    public int minOperations(int n) {
        int operations = 0;
        if(n % 2 == 0)
        {
            operations = (n / 2) * (n / 2);
        }
        else
        {
            operations = ((n - 1) / 2) * ((n + 1) / 2);
        }
        return operations;
    }
}