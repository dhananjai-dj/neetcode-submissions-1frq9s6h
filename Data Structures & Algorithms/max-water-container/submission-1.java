class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int low = 0;
        int high = n - 1;
        int max = 0;
        while (low < high) {
            int length = high - low;
            int height = Math.min(heights[high], heights[low]);
            max = Math.max(max, length * height);
            if (height == heights[low])
                low++;
            else
                high--;
        }
        return max;
    }
}
