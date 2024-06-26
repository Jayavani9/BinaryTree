//https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1?page=2&company%5B%5D=Amazon&category%5B%5D=Tree&sortBy=

class Solution
{
    int res = -1;
    int cnt = 0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        //Tc: O(n) Sc: O(n)
        
        helper(root, K);
        return res;
    }
    
    void helper(Node root,int K)
    {
        if(root == null || cnt >= K) return;
        
        helper(root.right, K);
        cnt++;
        
        if(cnt == K){
            res = root.data;
            return;
        }
        
        helper(root.left, K);
        
    }
}
