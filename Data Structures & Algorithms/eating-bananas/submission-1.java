class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (isEatable(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean isEatable(int[] piles, int k, int h) {
        long sum = 0;
        for (int i : piles) {
            sum += (int) Math.ceil( i / (k * 1.0));
        }
        return sum <= h;
    }
}
