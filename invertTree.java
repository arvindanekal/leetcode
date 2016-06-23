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
    public TreeNode invertTree(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        if(root==null) return root;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode item = stack.remove(0);
            TreeNode left = item.left;
            TreeNode right = item.right;
            item.left = right;
            item.right = left;
            if(left!=null) stack.add(left);
            if(right!=null) stack.add(right);
        }
        return root;
    }
}
