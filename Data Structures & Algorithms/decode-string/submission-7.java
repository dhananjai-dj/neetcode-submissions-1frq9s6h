class Solution {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        StringBuilder digit = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit.append(ch);
            } else if (ch == '[') {
                if (digit.length() > 0) {
                    numberStack.push(Integer.parseInt(digit.toString()));
                    digit.setLength(0);
                }

                wordStack.push(word.toString());
                word.setLength(0);

            } else if (ch == ']') {
                int count = numberStack.isEmpty() ? 1 : numberStack.pop();
                String repeated = word.toString().repeat(count);
                String outer = wordStack.isEmpty() ? "" : wordStack.pop();
                word.setLength(0);
                word.append(outer).append(repeated);
                if (numberStack.isEmpty()) {
                    result.append(word);
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }

        if (word.length() > 0) {
            result.append(word);
        }

        return result.toString();
    }
}