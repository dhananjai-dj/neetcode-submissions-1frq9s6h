class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> box = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.')
                    continue;
                String key = i / 3 + ":" + j / 3;
                if (row.computeIfAbsent(i, k -> new HashSet<>()).contains(ch)
                    || col.computeIfAbsent(j, k -> new HashSet<>()).contains(ch)
                    || box.computeIfAbsent(key, k -> new HashSet<>()).contains(ch)) {
                    return false;
                }
                row.get(i).add(ch);
                col.get(j).add(ch);
                box.get(key).add(ch);
            }
        }
        return true;
    }
}
