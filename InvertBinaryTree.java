226. Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.
  
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
  
Input: root = [2,1,3]
Output: [2,3,1]
  
Input: root = []
Output: []

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
    public TreeNode invertTree(TreeNode root) {
      // Tc: O(n) and Sc: O(n)
        if(root == null) return null;

        TreeNode t = root.right;
        root.right = root.left;
        root.left = t;
        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
