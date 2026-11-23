class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for (char ch : s1.toCharArray()) {
            map[ch - 'a'] += 1;
        }
        int window = s1.length();
        int n = s2.length();
        int p1 = 0;
        int p2 = 0;
        while (p2 < n) {
            if (p2 - p1 + 1 < window) {
                p2++;
                continue;
            }
            if (isValid(s2.substring(p1, p2 + 1), map)) {
                return true;
            }
            p1++;
            p2++;
        }
        return false;
    }
    private boolean isValid(String s1, int[] nums) {
        int[] map = new int[26];
        for (char ch : s1.toCharArray()) {
            map[ch - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != nums[i]) {
                return false;
            }
        }
        return true;
    }
}
