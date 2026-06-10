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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        List<List<Integer>> list = new ArrayList<>();
       
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
            }
            list.add(level);
        }
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size()-1; j++){
                if(i%2==0){
                    if(list.get(i).get(j) % 2 ==0) return false;
                    if(list.get(i).get(j)>=list.get(i).get(j+1)) return false;
                }else{
                    if(list.get(i).get(j) % 2 !=0) return false;
                    if(list.get(i).get(j)<=list.get(i).get(j+1)) return false;
                }
                
            }
            int last = list.get(i).get(list.get(i).size()-1);

            if(i%2==0){
                if(last%2==0) return false;
            }else{
                if(last%2!=0) return false;
            }
        }
        return true;
    }
}