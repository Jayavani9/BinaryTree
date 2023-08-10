Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Input: root = [1]
Output: [[1]]

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
 // Level Order traversal is usually implemented using BFS
 // BFS is a level order traversal algorithm
 // It uses Queue in an iterative approach
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> cur = new ArrayList<>();
            for(int i = 0 ; i < n ; i ++)
            {
                TreeNode node = q.poll();
                cur.add(node.val);

                if(node.left != null) q.add(node.left);

                if(node.right != null) q.add(node.right);
            }

            ans.add(cur);
        }


        return ans;
    }
}
