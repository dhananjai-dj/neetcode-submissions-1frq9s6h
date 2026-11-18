class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for (String string : paths) {
            if (string.equals(".") || string.equals("")) {
                continue;
            }
            if (string.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(string);
        }
        return "/" + stack.stream().collect(Collectors.joining("/"));
    }
}