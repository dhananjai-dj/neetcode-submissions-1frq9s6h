class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
           int[] map1 = new int[26];
           int[] map2 = new int[26];
           Arrays.fill(map1,0);
           Arrays.fill(map2,0);
           int n = s.length();
           for(int i = 0; i < n; i++){
                int index1 = s.charAt(i) - 97;
                int index2 = t.charAt(i) - 97;
                map1[index1] = map1[index1]+ 1;
                map2[index2] = map2[index2]+ 1;
           }
           for(int i = 0; i < 26; i++){
            if(map1[i] != map2[i]){
                return false;
            }
           }
           return true;
        }
        return false;
    }
}
