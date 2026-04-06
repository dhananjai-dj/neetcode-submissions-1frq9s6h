class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int left = 0;
        int right = len - 1;
        int max = 0;
        while(left < right){
            int breath = right - left;
            int height = heights[left] < heights[right] ? heights[left] : heights[right];
            max = max > breath * height ? max : breath * height;
            if(heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
