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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // recursion stop conditions
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val = t1.val + t2.val;   //override current node value
        t1.left = mergeTrees(t1.left, t2.left); // enter recursion left nodes
        t1.right = mergeTrees(t1.right, t2.right); //enter recursion right nodes
        return t1;
    }
}