993. Cousins in Binary Tree

Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, 
return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false

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

//Solution using DFS
  
class Solution {
    TreeNode xprnt; 
    TreeNode yprnt;
    int xht;
    int yht;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        dfs(root, null, 0, x, y);
        return xprnt != yprnt && xht == yht;
    }

    private void dfs(TreeNode root, TreeNode prnt, int level, int x, int y)
    {
        if(root == null) return;
        if(root.val == x){
            xprnt = prnt;
            xht = level;
        }

        if(root.val == y)
        {
            yprnt = prnt;
            yht = level;
        }

        dfs(root.left, root, level+1, x, y);
        dfs(root.right, root, level+1, x, y);
    }
}
