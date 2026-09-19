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
    public void reverseInorder(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode lN = root.left;
        root.left = root.right;
        root.right = lN;
            
        reverseInorder(root.left);
        reverseInorder(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        reverseInorder(root);
        return root;
    }
}
