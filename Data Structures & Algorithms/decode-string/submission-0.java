class Solution {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int number = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                number = (number * 10) + digit;
            } else if (ch == '[') {
                numbers.push(number);
                strings.push(sb.toString());
                number = 0;
                sb = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(strings.pop());
                temp.append(sb.toString().repeat(numbers.pop()));
                sb = temp;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}