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

//Using BFS 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
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
                if(i == 0) res.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
        }

        return res;
    }
}



//Solution using DFS:

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

        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}


//Other solution using DFS
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
       
        dfs(root.right, level+1);
        dfs(root.left, level+1);
    }
}
