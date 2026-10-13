class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<int[]> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int startIndex = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int cur = (i - top[0]) * top[1];
                max = Math.max(max, cur);
                startIndex = top[0];
            }
            stack.push(new int[] {startIndex, heights[i]});
        }
        while (!stack.isEmpty()) {
            int cur = (n - stack.peek()[0]) * stack.pop()[1];
            max = Math.max(max, cur);
        }
        return max;
    }
}
