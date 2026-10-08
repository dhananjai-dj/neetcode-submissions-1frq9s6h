class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
        for(int i : nums){
            if(i == element){
                count++;
            }else{
                count--;
                if(count == 0){
                    element = i;
                    count = 1;
                }
            }
        }
        return element;
    }
}