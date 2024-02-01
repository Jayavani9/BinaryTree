235. Lowest Common Ancestor of a Binary Search Tree

Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has
both p and q as descendants (where we allow a node to be a descendant of itself).”


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Iterative Approach
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int pVal = p.val;
        int qVal = q.val;

        TreeNode node = root;

        while(node != null)
        {
            int rootVal = node.val;

            if(rootVal < pVal && rootVal < qVal)
            {
                node = node.right;
            }

            else if(rootVal > pVal && rootVal > qVal)
            {
                node = node.left;
            }

            else
            {
                return node;
            }
        }
        return null;

// Recursive Approach
        /*
        if(root == null) return null;
        if(p.val < root.val && q.val < root.val)
        {
            return lowestCommonAncestor(root.left, p,q);
        }

        else if(p.val > root.val && p.val > root.val)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        else
        {
            return root;
        }
        */
        
    }
}
