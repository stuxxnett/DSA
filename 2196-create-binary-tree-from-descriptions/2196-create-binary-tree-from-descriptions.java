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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for(int i=0; i<descriptions.length; i++){
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int isLeft = descriptions[i][2];

            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));

            TreeNode p = map.get(parent);
            TreeNode c = map.get(child);

            if(isLeft==1){
                p.left = c;
            }else{
                p.right = c;
            }
            
            children.add(child);
        }
        for(int[] d:descriptions){
            if(!children.contains(d[0])){
                return map.get(d[0]);
            }
        }
        return null;
        

    }
    
}