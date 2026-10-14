class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    } else {
                        int low = j + 1;
                        int high = n - 1;
                        long preSum = nums[i] + nums[j];
                        while (low < high) {
                            long sum = preSum + nums[low] + nums[high];
                            if (sum == target) {
                                result.add(List.of(nums[i], nums[j], nums[low], nums[high]));
                                low++;
                                high--;
                                while (low < high && nums[low] == nums[low - 1]) {
                                    low++;
                                }
                                while (low < high && nums[high] == nums[high + 1]) {
                                    high--;
                                }
                            } else if (sum < target) {
                                low++;
                            } else {
                                high--;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}