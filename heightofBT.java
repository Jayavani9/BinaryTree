//https://www.geeksforgeeks.org/problems/height-of-binary-tree/1?page=1&company%5B%5D=Amazon&category%5B%5D=Tree&sortBy=//

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

//Recursive solution

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        //Tc: O(n) Sc: O(n) 
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        
        return 1 + Math.max(lh, rh);
        
    }
}
