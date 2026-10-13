class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i : prices){
            minPrice = Math.min(i, minPrice);
            max = Math.max(max, i - minPrice);
        }
        return max;
    }
}
