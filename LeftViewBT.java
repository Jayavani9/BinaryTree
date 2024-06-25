//https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1?page=1&company%5B%5D=Amazon&category%5B%5D=Tree&sortBy=

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
        //Tc: O(n) Sc: O(n)
       ArrayList<Integer> ans = new  ArrayList<Integer>();
       Queue<Node> q = new LinkedList<>();
       if(root == null) return ans;
       q.add(root);
       while(!q.isEmpty())
       {
          int size = q.size();
          for(int i = 0; i < size; i++)
          {
              Node cur = q.poll();
              if(i == 0) ans.add(cur.data);
              if(cur.left != null)q.add(cur.left);
              if(cur.right != null)q.add(cur.right);
          }
       }
       return ans;
    }
}
