class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        
        for(int i=heights.length-1; i>=0; i--) {
            int count = 0;
            while(!stack.isEmpty()) {
                if(heights[i] > stack.peek()) {
                    stack.pop();
                    count++;
                } else {
                    stack.push(heights[i]);
                    count++;
                    break;
                }
            }
            if(stack.isEmpty()) {
                stack.push(heights[i]);
            }
            ans[i] = count;
        }
        return ans;
    }
}