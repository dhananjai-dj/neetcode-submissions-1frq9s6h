class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        int p1 = 0;
        int p2 = 0;
        while (p2 < s.length()) {
            char ch = s.charAt(p2);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, map.get(ch));
            if ((p2 - p1 + 1) - maxCount > k) {
                map.put(s.charAt(p1), map.get(s.charAt(p1)) - 1);
                p1++;
            }
            p2++;
            max = Math.max(p2 - p1, max);
        }
        return max;
    }
}
