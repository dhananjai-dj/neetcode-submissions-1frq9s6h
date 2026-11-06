class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean isAlive = true;
            while (isAlive && !stack.isEmpty() && stack.peek() > 0 && i < 0) {
                int sum = i + stack.peek();
                if (sum == 0) {
                    stack.pop();
                    isAlive = false;
                } else if (sum < 0) {
                    stack.pop();
                } else {
                    isAlive = false;
                }
            }
            if (isAlive) {
                stack.push(i);
            }
        }
        int n = stack.size();
        int[] result = new int[n];
        for (int i = n - 1; i > -1; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}