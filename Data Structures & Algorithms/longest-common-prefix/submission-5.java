class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}