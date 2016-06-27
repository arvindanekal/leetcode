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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<TreeNode> newqueue = new ArrayList<>();
            List<Integer> level = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode item = queue.remove(0);
                level.add(item.val);
                if(item.left != null) newqueue.add(item.left);
                if(item.right != null) newqueue.add(item.right);
            }
            result.add(level);
            while(!newqueue.isEmpty()){
                queue.add(newqueue.remove(0));
            }
        }
        List<List<Integer>> updatedresult = new ArrayList<List<Integer>>();
        for(int i=result.size()-1;i>=0;i--)
            updatedresult.add(result.get(i));
        return updatedresult;
    }
}
