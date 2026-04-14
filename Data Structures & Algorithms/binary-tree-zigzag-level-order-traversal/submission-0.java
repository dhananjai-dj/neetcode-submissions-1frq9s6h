class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int len = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (leftToRight)
                    list.addLast(node.val);
                else
                    list.addFirst(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(list);
            leftToRight = !leftToRight;
        }

        return result;
    }
}