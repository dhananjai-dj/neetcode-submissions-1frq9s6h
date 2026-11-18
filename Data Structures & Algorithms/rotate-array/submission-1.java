class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n - 1, nums);
        reverse(0,  k - 1, nums);
        reverse(k, n - 1, nums);
    }
    public void reverse(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    // 8 7 6 5 4 3 2 1
    // 5 6 7 8 1 2 3 4
}