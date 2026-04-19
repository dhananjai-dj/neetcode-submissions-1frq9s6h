class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            int key = currentSum - k;
            if(map.containsKey(key)){
                count += map.get(key);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}