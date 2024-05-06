/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
   
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        //Tc: O(N)  Sc: O(1)
        TreeNode successor = null;
        while(root != null)
        {
            if(root.val <= p.val)
            {
                root = root.right;
            }
            else
            {
                successor = root;
                root = root.left;
            }
        }

        return successor;
       
    }
}

/*
class Solution {
    //Tc: O(N)  Sc: O(N)
    List<Integer> arr = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        helper(root);
        for(int i = 0; i < arr.size()-1; i++)
        {
            if(p.val == arr.get(i)){
                return new TreeNode(arr.get(i+1));
            }
        }
        return null;
    }

    private void helper(TreeNode root)
    {
        if(root == null) return;
        helper(root.left);
        arr.add(root.val);
        helper(root.right);
    }
}

*/
