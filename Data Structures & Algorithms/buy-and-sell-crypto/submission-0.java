class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1){
            return 0;
        }
        int p1 = 0;
        int p2 = 1;
        int max = 0;
        while(p1 < n && p2 < n){
            if(prices[p1] > prices[p2]){
                p1++;
            }else{
                max = Math.max(max , prices[p2] - prices[p1]);
                p2++;
            }
        }
        return max;
    }
}
