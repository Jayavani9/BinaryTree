//1261. Find Elements in a Contaminated Binary Tree


//Solution using DFS 
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
class FindElements {
    HashSet<Integer> hset; 
    public FindElements(TreeNode root) {
        hset = new HashSet<>();
        dfs(root, 0);
    }
    
    public boolean find(int target) {
        return hset.contains(target);
    }

    private void dfs(TreeNode cur, int val)
    {
        if(cur == null) return;
        hset.add(val);
        dfs(cur.left, val*2+1);
        dfs(cur.right, val*2+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
