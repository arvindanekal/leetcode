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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        boolean lresult = false;
        boolean rresult = false;
        sum -= root.val;
        if(root.left != null)
            lresult = hasPathSum(root.left, sum);
        if(root.right != null)
            rresult = hasPathSum(root.right, sum);
        
        if(root.left == null && root.right == null){
            if(sum == 0) return true;
            return false;
        }
        return lresult || rresult;
    }
}
