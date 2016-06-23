package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public static void main(String[] args) {

	// write your code here
    }

    public int maxDepth(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<TreeNode> newstack = new ArrayList<TreeNode>();
        if(root == null) return 0;
        stack.add(root);
        int depth = 0;
        while(!stack.isEmpty()){
            while(!stack.isEmpty()){
                TreeNode item = stack.remove(0);
                if(item.left != null) newstack.add(item.left);
                if(item.right != null) newstack.add(item.right);
            }
            while(!newstack.isEmpty()){
                stack.add(newstack.remove(0));
            }
            depth++;
        }
        return depth;
    }
}
