//https://leetcode.com/problems/binary-tree-maximum-path-sum/

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
    //Tc: O(n)  Sc: O(n) 
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);   
        return ans;
    }

    private int helper(TreeNode root)
    {
        if(root == null) return 0;

        int lSum = Math.max(helper(root.left),0);
        int rSum = Math.max(helper(root.right),0);

        int totSum = root.val + lSum + rSum;

        ans = Math.max(ans, totSum);

        return root.val + Math.max(lSum, rSum);

    }
}


