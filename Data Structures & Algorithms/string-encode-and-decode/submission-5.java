class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length() + "#" + str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        int i = 0;
        int st = -1;
        StringBuilder len = new StringBuilder();
        while (i < n) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (st == -1) {
                    st = i;
                }
                len.append(ch + "");
                i++;
            } else if (ch == '#') {
                int length = Integer.parseInt(str.substring(st, i));
                i++;
                result.add(str.substring(i, i + length));
                i += length;
                st = -1;
            }
        }
        return result;
    }
}
