//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/

//Tc: O(n) Sc: O(n)
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        if(root.left == null && root.right == null) return -1;
        int ans = find(root, root.val);
        return ans;
    }

    private int find(TreeNode root, int val)
    {
        if(root == null) return -1;
        if(root.val > val) return root.val;

        int left = find(root.left, root.val);
        int right = find(root.right, root.val);

        if(left == -1 && right == -1) return -1;
        if(left == -1) return right;
        if(right == -1) return left;

        return Math.min(left, right);
    }
}
