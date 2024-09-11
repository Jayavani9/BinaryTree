//https://leetcode.com/problems/sum-of-left-leaves/?envType=daily-question&envId=2024-09-10

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
    //Tc: O(n) Sc: O(h)
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return ans;
    }

    private void helper(TreeNode root, boolean isLeft)
    {
        if(root == null) return;
        if(root.left == null && root.right == null &&isLeft)
        {
            ans += root.val;
        }
        helper(root.left, true);
        helper(root.right, false);
    }
}
