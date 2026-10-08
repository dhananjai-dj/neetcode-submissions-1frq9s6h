class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>(n);
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}