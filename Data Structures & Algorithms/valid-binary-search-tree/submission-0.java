class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        int max = 1001;
        int min = -1001;
        return isValidNode(root, min, max);
    }

    private boolean isValidNode(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return isValidNode(root.left, min, root.val) && isValidNode(root.right, root.val, max);
    }
}
/*
            2
        1        3 

        max = 1001
        min = -1001

        val = 1

        val = 2              val = 3
        max = 1              max = 1001
        min = -1001          min = 1



*/