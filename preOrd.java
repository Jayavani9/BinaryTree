//https://www.geeksforgeeks.org/problems/preorder-traversal/1

class BinaryTree
{
    static void preOrder(Node root, ArrayList<Integer> res)
    {
        //Tc: O(n) Sc: O(n) 
        if(root == null) return;
        
        res.add(root.data);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        preOrder(root, res);
        return res;
        
    }

}
