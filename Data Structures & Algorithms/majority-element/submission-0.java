class Solution {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
        int count = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(cur == nums[i]){
                count++;
            }else{
                count--;
                if(count < 0){
                    cur = nums[i];
                }
            }
        }
       return cur;
    }
}