class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String str : strs){
            sb.append(str.length() + "#" + str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        int n = str.length();
        int length = 0;
        List<String> result = new ArrayList<>();
        while(i < n){
            char ch = str.charAt(i);
            if(ch >= 48 && ch <= 57){
                int digit = ch - '0';
                length = length * 10 + digit;
                i++;
            }
            else if(ch == '#'){ 
                i++; 
                int currentLength = length;
                length = 0; 
                
                StringBuilder sb = new StringBuilder("");
                int j = 0;
                while(i < n && j < currentLength){
                    sb.append(str.charAt(i));
                    i++;
                    j++;
                }
                result.add(sb.toString());
            }
        }
        return result;
    }
}