class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        Set<String> set = Set.of("+", "-", "*", "/");
        for (String token : tokens) {
            String value;
            int num2;
            int num1;
            switch (token) {
                case "+":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    value = (String.valueOf(num1 + num2));
                    break;
                case "-":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    value = (String.valueOf(num1 - num2));
                    break;
                case "*":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    value = (String.valueOf(num1 * num2));
                    break;
                case "/":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    value = (String.valueOf(num1 / num2));
                    break;
                default:
                    value = token;
                    break;
            }
            stack.push(value);
        }
        return Integer.parseInt(stack.pop());
    }
}
