class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String string : operations) {
            switch (string) {
                case "+":
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int num3 = num1 + num2;
                    stack.push(num2);
                    stack.push(num1);
                    stack.push(num3);
                    break;
                case "D":
                    int num = stack.peek();
                    stack.push(2 * num);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(string));
                    break;
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}