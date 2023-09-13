class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length < 2)
        {
            return pref;
        }
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        arr[1] = pref[0]  ^ pref[1];
        int arrXor = arr[0] ^ arr[1];
        for(int index = 2 ; index < pref.length ; index++)
        {
            arr[index] = arrXor ^ pref[index];
            arrXor ^= arr[index];
        }
        return arr;
    }
}