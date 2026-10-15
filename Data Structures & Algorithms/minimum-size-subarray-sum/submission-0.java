class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;
        int n = nums.length;
        while(p2 < n){
            sum += nums[p2];
            while(sum >= target){
                min = Math.min(min, p2 - p1 + 1);
                sum -= nums[p1++];
            }
            p2++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}