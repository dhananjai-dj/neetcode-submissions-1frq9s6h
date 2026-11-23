class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int maxFreq = 0;
        int max = 0;
        int p1 = 0;
        int p2 = 0;
        while (p2 < s.length()) {
            char ch = s.charAt(p2);
            map[ch - 'A'] += 1;
            maxFreq = Math.max(maxFreq, map[ch - 'A']);
            while ((p2 - p1 + 1 - maxFreq) > k) {
                ch = s.charAt(p1);
                map[ch - 'A'] -= 1;
                p1++;
            }
            max = Math.max(max, p2 - p1 + 1);
            p2++;
        }
        return max;
    }
   
}
