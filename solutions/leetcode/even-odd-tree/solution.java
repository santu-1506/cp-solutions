// Problem  : Even Odd Tree
// Difficulty: Medium
// Tags     : Tree, Breadth-First Search, Binary Tree
// URL      : https://leetcode.com/problems/even-odd-tree/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int prev;
            if(level %2 == 0){
                prev = Integer.MIN_VALUE;
            }
            else{
                prev = Integer.MAX_VALUE;
            }
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                int val = node.val;
                if(level%2 == 0){
                    if(val%2 == 0 || prev>=val){
                        return false;
                    }
                }
                else{
                    if(val%2!=0 || prev<=val){
                        return false;
                    }
                }
                prev = val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return true;
    }
}
