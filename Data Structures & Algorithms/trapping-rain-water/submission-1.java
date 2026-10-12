class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            maxRight = Math.max(maxRight, height[j]);
            right[j] = maxRight;
            maxLeft = Math.max(maxLeft, height[i]);
            left[i] = maxLeft;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }
        return sum;
    }
}
