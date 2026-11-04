class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] nums = new int[n][2];
        for(int i = 0; i < n; i++){
            nums[i][0] = position[i];
            nums[i][1] = speed[i];
        }
        Arrays.sort(nums, (a,b) -> b[0] - a[0]);
       // time = remaining distance / speed
       // if the previous cars timing is less than the current time then new fleet because it will not merge
        double prev = (double)(target - nums[0][0]) / nums[0][1];

        int fleets = 1;
        for(int i = 1; i < n; i++){
            double cur = (double)(target - nums[i][0]) / nums[i][1];
            if(prev < cur){
                fleets++;
                prev = cur;
            }
        }
        return fleets;
    }
}
