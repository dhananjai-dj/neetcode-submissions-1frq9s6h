class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answer = new int [2*n];
        for(int i = 0; i < n; i++){
            answer[i] = answer[n+i] = nums[i];
        }
        return answer;
    }
}