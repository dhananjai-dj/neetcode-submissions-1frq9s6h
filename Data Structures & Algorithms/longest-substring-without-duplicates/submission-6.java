class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] visited = new boolean[256];
        int max = 0;
        int p1 = 0;
        int p2 = 0;
        int n = s.length();
        while (p2 < n) {
            while (p1 < p2 && visited[s.charAt(p2)]) {
                visited[s.charAt(p1++)] = false;
            }
            max = Math.max(max, p2 - p1 + 1);
            visited[s.charAt(p2++)] = true;
        }
        return max;
    }
}
