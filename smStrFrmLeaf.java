//https://leetcode.com/problems/smallest-string-starting-from-leaf/description/

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
    //Tc: O(n^2)  Sc: O(n) 
    String ans = "";
    public String smallestFromLeaf(TreeNode root) {
        String cur = "";
        helper(root, cur);
        return ans;
    }

    private void helper(TreeNode root, String cur)
    {
        if(root == null) return;

        cur = (char)(root.val + 'a') + cur;

        if(root.left == null && root.right == null) {
            if(ans.isEmpty() || ans.compareTo(cur) > 0)
            {
                ans = cur;
            }
        }

        if(root.left != null) helper(root.left, cur);
        if(root.right != null) helper(root.right, cur);
    }
}
