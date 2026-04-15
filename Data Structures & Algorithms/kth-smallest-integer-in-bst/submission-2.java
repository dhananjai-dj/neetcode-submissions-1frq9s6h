/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int val = -1;
    int i = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        traversal(root, k);
        return val;
    }
    private void traversal(TreeNode root, int k){

        if(root == null){
            return;
        }
        traversal(root.left, k);
        i++;
        if(i == k){
            val = root.val;
            return;
        }
        traversal(root.right, k);
    }
}
