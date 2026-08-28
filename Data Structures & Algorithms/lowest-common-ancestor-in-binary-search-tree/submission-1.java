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

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(p==root || q==root) return root;
        if(p.val<root.val && q.val<root.val){
            TreeNode l=lowestCommonAncestor(root.left,p,q);
            return l;
        }
        if(p.val>root.val && q.val>root.val){
            TreeNode r = lowestCommonAncestor(root.right,p,q);
            return r;
        }
        else{
            TreeNode l=lowestCommonAncestor(root.left,p,q);
            TreeNode r = lowestCommonAncestor(root.right,p,q);

            if(l==null) return r;
            if(r==null) return l;
            return root;

            
        }
        
    }
}
