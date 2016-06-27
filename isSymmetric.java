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
    public boolean isSymmetric(TreeNode root) {
        List<TreeNode> queue = new ArrayList<TreeNode>();
        if(root==null) return true;
        queue.add(root);
        while(!queue.isEmpty()){
            List<TreeNode> newqueue = new ArrayList<TreeNode>();
            while(!queue.isEmpty()){
                TreeNode item = queue.remove(0);
                if(item.left != null) {
                    newqueue.add(item.left);
                }else{
                    newqueue.add(null);
                }
                
                if(item.right != null) newqueue.add(item.right);
                else newqueue.add(null);
            }
            for(int i=0;i<newqueue.size()/2;i++){
                TreeNode itema = newqueue.get(i);
                TreeNode itemb = newqueue.get(newqueue.size()-1-i);
                if(itema == null && itemb == null) continue;
                if(itema == null||itemb == null) return false;
                if(itema.val != itemb.val) return false;
            }
            while(!newqueue.isEmpty()){
                TreeNode item = newqueue.remove(0);
                if(item != null)
                    queue.add(item);
            }
        }
        return true;
    }
}
