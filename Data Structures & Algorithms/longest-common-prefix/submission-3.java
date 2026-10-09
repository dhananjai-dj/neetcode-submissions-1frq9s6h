class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 1) {
            return strs[0];
        }
        String minString = strs[0];
        int minLength = minString.length();
        for (String str : strs) {
            int curLength = str.length();
            if (curLength < minLength) {
                minLength = curLength;
                minString = str;
            }
        }
        boolean isBreaked = false;
        int i = 0;
        for (; i < minLength; i++) {
            char ch = minString.charAt(i);
            for (int j = 0; j < n; j++) {
                if (ch != strs[j].charAt(i)) {
                    isBreaked = true;
                    break;
                }
            }
            if(isBreaked){
                break;
            }
        }
        return minString.substring(0, i);
    }
}