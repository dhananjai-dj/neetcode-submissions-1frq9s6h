class Solution {
    public int maxProfit(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return 0;
        }
        int p1 = 0;
        int p2 = 1;
        int max = 0;
        while(p2 < len){
            if(nums[p1] < nums[p2]){
                max = Math.max(max, nums[p2] - nums[p1]);
            }else{
                p1 = p2;
            }
            p2++;
        }
        return max;
    }
}
