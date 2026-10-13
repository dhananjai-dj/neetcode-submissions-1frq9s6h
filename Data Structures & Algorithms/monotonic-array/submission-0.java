class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean isIncrease = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                isIncrease = true;
                break;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (isIncrease && nums[i] < nums[i - 1]) {
                return false;
            } else if (!isIncrease && nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}