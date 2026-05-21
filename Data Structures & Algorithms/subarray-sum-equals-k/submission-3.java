class Solution {
    public int subarraySum(int[] nums, int k) {
        // 2,-1,1,2
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int curSum = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            curSum += nums[i];
            int key = curSum - k;
            if(map.containsKey(key)){
                count += map.get(key);
            }
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }
        return count;
    }
}