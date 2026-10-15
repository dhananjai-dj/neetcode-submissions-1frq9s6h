class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String str : paths) {
            if ("..".equals(str)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!str.equals("") && !str.equals(".")) {
                stack.push(str);
            }
        }
        return "/" + String.join("/", stack);
    }
}