class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int prev = nums[0];
        int n = nums.length;
        int index = 1;
        int i = 1;
        while (i < n) {
            if (prev != nums[i]) {
                prev = nums[index++] = nums[i];
            }
            i++;
        }
        return index;
    }
}