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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        boolean reverse = false;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);

        while(!dq.isEmpty()){
            int size = dq.size();   
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; i++){
                if(!reverse){
                    TreeNode curr = dq.pollFirst();
                    level.add(curr.val);
                    if(curr.left != null) dq.addLast(curr.left);
                    if(curr.right != null) dq.addLast(curr.right);
                }else{
                    TreeNode curr = dq.pollLast();
                    level.add(curr.val);
                    if(curr.right != null) dq.addFirst(curr.right);
                    if(curr.left != null) dq.addFirst(curr.left);
                }
            }
            reverse = !reverse;
            list.add(level);
        }
        return list;
    }
}