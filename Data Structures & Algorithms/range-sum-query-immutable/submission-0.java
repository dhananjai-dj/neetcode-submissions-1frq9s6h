class NumArray {
    int[] array;
    int[] prefixSum;
    public NumArray(int[] nums) {
        int len = nums.length;
        array  = new int[len];
        prefixSum = new int[len];
        array[0] = prefixSum[0] = nums[0];
        for(int i = 1; i < len; i++){
            array[i] = nums[i];
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }

    }
    
    public int sumRange(int left, int right) {
        if(left > 0){
            return prefixSum[right] - prefixSum[left - 1];
        }
        return prefixSum[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */