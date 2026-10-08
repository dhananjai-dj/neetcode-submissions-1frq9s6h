class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = getKey(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }

    private String getKey(String str) {
        int[] key = new int[26];
        for (char ch : str.toCharArray()) {
            key[ch - 97] = key[ch - 97] + 1;
        }
        return Arrays.toString(key);
    }
}
