199. Binary Tree Right Side View

Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.


Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Example 2:

Input: root = [1,null,3]
Output: [1,3]
Example 3:

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

Solution using BFS: 

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        //Tc: O(n)  Sc: O(h) where h = height of the tree
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty() )
        {
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode cur = q.poll();
                if(i == size-1) res.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
        }

        return res;
    }
}

Solution using DFS:

class Solution {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
         res = new ArrayList<>();
         if(root == null) return res;
         dfs(root, 0);
         return res;
    }

    private void dfs(TreeNode root, int level)
    {
        if(root == null) return;
        if(res.size() == level) {
            res.add(root.val);
        }
        else
        {
            res.set(level, root.val);
        }

        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
