//https://www.geeksforgeeks.org/problems/inorder-traversal/1

class Solution {
    ArrayList<Integer> ans;
    // Function to return a list containing the inorder traversal of the tree.
    //Tc: O(n) Sc: O(n)
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ans = new ArrayList<>();
        inorder(root);
        return ans;
    }
    
    private void inorder(Node root)
    {
        if(root == null) return;
        inorder(root.left);
        ans.add(root.data);
        inorder(root.right);
    }
}
