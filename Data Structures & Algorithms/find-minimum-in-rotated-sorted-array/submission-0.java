class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
/*
4,5,6,7
3,4,5,6,1,2 

4,5,6,0,1,2,3,

if mid > right
    left = mid + 1;
else
    right = mid;
*/