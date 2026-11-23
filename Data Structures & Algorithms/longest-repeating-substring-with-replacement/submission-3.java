class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int max = 0;
        int p1 = 0;
        int p2 = 0;
        while (p2 < s.length()) {
            char ch = s.charAt(p2);
            map[ch - 'A'] += 1;
            while ((p2 - p1 + 1 - maxCount(map)) > k) {
                ch = s.charAt(p1);
                map[ch - 'A'] -= 1;
                p1++;
            }
            max = Math.max(max, p2 - p1 + 1);
            p2++;
        }
        return max;
    }
    private int maxCount(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        return max;
    }
}
