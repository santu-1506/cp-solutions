// Problem  : Lowest Common Ancestor of a Binary Tree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree
// URL      : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Solved on: 2026-04-08 19:51
// ──────────────────────────────────────────────────

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        return left!=null ? left : right;
    }
}
