class Solution {
    public int subtract(int max,int min)
    {
        return max - min;
    }
    public int countOperations(int num1, int num2) {
        int count = 0;
        if(num1 == 0 || num2 == 0)
        {
            return count;
        }
        while ( num1 != 0 && num2 != 0)
        {
            if(num1 > num2)
            {
                num1 = subtract(num1,num2);
                count++;
            }
            else
            {
                num2 = subtract(num2,num1);
                count++;
            }
        }
        return count;
    }
}