/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return height(root) > -1 ? true: false;
    }
    public int height(TreeNode root){
        if(root.left == null && root.right == null) return 1;
        int lh = 0, rh = 0;
        if(root.left != null) lh = height(root.left);
        if(root.right != null) rh = height(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
}
