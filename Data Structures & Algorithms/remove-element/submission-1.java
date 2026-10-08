class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = 0;
        int pointer = 0;
        while (pointer < n) {
            if (nums[pointer] != val) {
                nums[index++] = nums[pointer];
            }
            pointer++;
        }
        return index;
    }
}