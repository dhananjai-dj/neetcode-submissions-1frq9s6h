class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;
        int p3 = n - 1;
        while (p2 <= p3) {
            if (nums[p2] == 0) {
                int temp = nums[p1];
                nums[p1++] = nums[p2];
                nums[p2++] = temp;
            } else if (nums[p2] == 1) {
                p2++;
            } else {
                int temp = nums[p3];
                nums[p3--] = nums[p2];
                nums[p2] = temp;
            }
        }
    }
}