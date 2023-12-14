112. Path Sum

Given the root of a binary tree and an integer targetSum, 
return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

class Solution {
    //Tc: O(N) where N is the no.of nodes in the tree and Sc: O(H) where H is the height of the binary tree
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root, targetSum);
    }
    private boolean check(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        boolean leftPath = check(root.left, targetSum - root.val);
        if (leftPath) {
            return true;
        }
        return check(root.right, targetSum - root.val);
    }
}
