class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>(n);
        int prev = 0;
        int index = 0;
        int max = 0;
        while(index < n){
            while(prev < index && set.contains(s.charAt(index))){
                set.remove(s.charAt(prev));
                prev++;
            }
            set.add(s.charAt(index));
            max = Math.max(max, set.size());
            index++;
        }
        return Math.max(max, set.size());
    }
}
