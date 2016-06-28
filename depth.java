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
    public int depth(TreeNode root, int d){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return d+1;
        int ld = 0, rd = 0;
        ld = depth(root.left, d+1);
        rd = depth(root.right, d+1);
        if(ld > 0 && rd >0) return ld < rd? ld : rd;
        if(ld> 0) return ld;
        if(rd > 0) return rd;
        return 0;
    }
    
    public int minDepth(TreeNode root) {
        return depth(root, 0);
    }
}
