class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p1 = 0;
        int p2 = 0;
        int max = 0;
        int len = s.length();
        Set<Character> set = new HashSet<>(95);
        while(p2 < len){
            while(p1 < p2 && set.contains(s.charAt(p2))){
                set.remove(s.charAt(p1));
                p1++;
            }
            set.add(s.charAt(p2));
            p2++;
            max = Math.max(max, p2 - p1);
        }
        return max;
    }
}
