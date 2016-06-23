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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> stack1 = new ArrayList<TreeNode>();
        List<TreeNode> stack2 = new ArrayList<TreeNode>();

        if(p== null && q == null) return true;
        if(p != null ) stack1.add(p);
        if(q != null ) stack2.add(q);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.size() != stack2.size()) return false;
            TreeNode item1 = stack1.remove(0);
            TreeNode item2 = stack2.remove(0);
            if(item1.val != item2.val){
                return false;
            }
            if(item1.left != null && item2.left != null){
                if(item1.left.val != item2.left.val) return false;
                stack1.add(item1.left);
                stack2.add(item2.left);
            }else if(item1.left != null || item2.left != null){
                return false;
            }
            
            if(item1.right != null && item2.right != null){
                if(item1.right.val != item2.right.val) return false;
                stack1.add(item1.right);
                stack2.add(item2.right);
            }else if(item1.right != null || item2.right != null){
                return false;
            }
        }
        if(!stack1.isEmpty() || !stack2.isEmpty())
            return false;
        return true;
    }
}
