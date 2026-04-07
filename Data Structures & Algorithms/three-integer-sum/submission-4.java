class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i ++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                if(nums[left] + nums[right] + nums[i] == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left - 1] == nums[left]){
                        left++;
                    }
                    while(left < right && nums[right + 1] == nums[right]){
                        right--;
                    }
                }else if(nums[left] + nums[right] + nums[i] > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
