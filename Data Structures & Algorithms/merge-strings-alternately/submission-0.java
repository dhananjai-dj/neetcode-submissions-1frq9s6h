class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        boolean firstSmall = word1.length() < word2.length();
        if (firstSmall) {
            len = word1.length();
        } else {
            len = word2.length();
        }
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i) + "" + word2.charAt(i));
        }
        if (firstSmall) {
            sb.append(word2.substring(len));
        } else {
            sb.append(word1.substring(len));
        }
        return sb.toString();
    }
}