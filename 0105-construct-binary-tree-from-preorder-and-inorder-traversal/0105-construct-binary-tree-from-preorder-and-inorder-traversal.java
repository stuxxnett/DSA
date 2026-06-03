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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inMap = new HashMap<>(); 
        for(int i=0; i<inorder.length; i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=build(inMap,preorder,0,preorder.length-1,inorder,0,inorder.length-1);

        return root;
    }
    TreeNode build(HashMap<Integer,Integer> inMap,int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend){

        if(prestart>preend || instart>inend) return null;

        //creating root
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = inMap.get(root.val);
        int numsleft = inroot-instart;

        root.left = build(inMap,preorder,prestart+1,prestart+numsleft,inorder,instart,inroot-1);
        root.right = build(inMap,preorder,prestart+numsleft+1,preend,inorder,inroot+1,inend);
        return root;
    }
}