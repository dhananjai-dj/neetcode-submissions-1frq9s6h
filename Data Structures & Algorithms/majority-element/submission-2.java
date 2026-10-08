class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = -1;
        for (int i : nums) {
            if (count == 0) {
                element = i;
            }
            if (i == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}