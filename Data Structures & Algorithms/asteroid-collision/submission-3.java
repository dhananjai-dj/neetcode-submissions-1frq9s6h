class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean isAlive = true;
            while (isAlive && !stack.isEmpty() && stack.peek() > 0 && i < 0) {
                int top = stack.pop();
                int sum = top + i;
                if (sum != 0) {
                    if (Math.abs(top) > Math.abs(i)) {
                        stack.push(top);
                        isAlive = false;
                    }
                } else if (sum == 0) {
                    isAlive = false;
                }
            }
            if (isAlive) {
                stack.push(i);
            }
        }
        int n = stack.size();
        int i = n - 1;
        int[] result = new int[n];
        while (!stack.isEmpty()) {
            result[i--] = stack.pop();
        }
        return result;
    }
}