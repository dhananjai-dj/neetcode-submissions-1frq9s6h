class Solution {
    public int search(int[] nums, int target) {
        int minIndex = findMinIndex(nums);
        int left = 0;
        int right = nums.length - 1;
        if(target >= nums[minIndex] && target <= nums[right] ){
            left = minIndex;
        }else{
            right = minIndex;
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }
    private int findMinIndex(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

}
