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
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
            if(root==null) return root;
            if(p==root || q==root) return root;

            TreeNode a=lowestCommonAncestor(root.left,p,q);
            TreeNode b=lowestCommonAncestor(root.right,p,q);

            if(a==null && b==null) return null;
             if (a != null && b != null) return root;

            if(a==null) return b;
            else return a;

            




        
    }
 
}