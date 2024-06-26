//https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1?page=2&company%5B%5D=Amazon&category%5B%5D=Tree&sortBy=


class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        //Tc: O(n) Sc: O(n)
        
        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;
        
        // Reverse in-order traversal using a stack
        while (current != null || !stack.isEmpty()) {
            // Push all right children to stack
            while (current != null) {
                stack.push(current);
                current = current.right;
            }

            // Process the node
            current = stack.pop();
            count++;
            if (count == K) {
                return current.data;  // Found kth largest
            }

            // Move to the left child
            current = current.left;
        }

        return -1; 
    }
}



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
