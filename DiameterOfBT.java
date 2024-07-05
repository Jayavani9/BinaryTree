//https://leetcode.com/problems/diameter-of-binary-tree/

//TC: o(n) Sc: O(n)
class Solution {
    private int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0; 
        helper(root); 
        return ans;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0; 

        int leftPath = helper(node.left);
        int rightPath = helper(node.right);
      
        ans = Math.max(ans, leftPath + rightPath);
        return Math.max(leftPath, rightPath) + 1;
    }
}
