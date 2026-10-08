class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        for(int i = 0; i < n; i++){
            s1[s.charAt(i) - 97] = s1[s.charAt(i) - 97] + 1;
            s2[t.charAt(i) - 97] = s2[t.charAt(i) - 97] + 1;
        }
        for(int i = 0; i < 26; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
}
