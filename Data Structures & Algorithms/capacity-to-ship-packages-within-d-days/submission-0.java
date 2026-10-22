class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (isMoveAble(weights, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isMoveAble(int[] weights, int k, int days) {
        int total = 1;
        int sum = 0;
        for (int i : weights) {
            if (sum + i > k) {
                sum = i;
                total++;
            } else {
                sum += i;
            }
        }
        return total <= days;
    }
}