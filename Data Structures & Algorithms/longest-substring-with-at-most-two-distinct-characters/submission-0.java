class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        int length = s.length();
        int[] map = new int[26];
        while(right < length){
            int index = s.charAt(right) - 97;
            map[index] = map[index] + 1;
            while(left < right && uniqueCount(map) > 2){
                index = s.charAt(left) - 97;
                map[index] = map[index] - 1;
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
    private int uniqueCount(int[] map){
        int count = 0;
        for(int i = 0 ; i < 26; i++){
            if(map[i] > 0){
                count++;
            }
        }
        return count;
    } 
}