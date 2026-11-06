class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        String result = "";
        Map<Character, Integer> map1 = new HashMap<>(52);
        Map<Character, Integer> map2 = new HashMap<>(52);
        for (char ch : t.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int p1 = 0;
        int p2 = 0;
        int n = s.length();
        while (p2 < n) {
            char ch = s.charAt(p2);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            while (isValid(map1, map2)) {
                if (p2 - p1 + 1 < min) {
                    min = p2 - p1 + 1;
                    result = s.substring(p1, p2 + 1);
                }
                ch = s.charAt(p1++);
                map2.put(ch, map2.get(ch) - 1);
            }
            p2++;
        }
        return result;
    }

    private boolean isValid(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (char ch : map1.keySet()) {
            if (map2.get(ch) == null || map1.get(ch) > map2.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
