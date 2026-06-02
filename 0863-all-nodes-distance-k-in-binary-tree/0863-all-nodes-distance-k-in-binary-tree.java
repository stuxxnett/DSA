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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
        markParent(root,parentMap);
        HashMap<TreeNode,Boolean> visited = new HashMap<>();//map for visited node
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        int dist=0;

        while(!q.isEmpty()){
            int size = q.size();
            if(dist==k) break;
            dist++;
            for(int i=0; i<size; i++){
                TreeNode curr=q.poll();

                if(curr.left != null && visited.get(curr.left)==null){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right != null && visited.get(curr.right)==null){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if(parentMap.get(curr) !=null && visited.get(parentMap.get(curr))==null){
                    q.offer(parentMap.get(curr));
                    visited.put(parentMap.get(curr),true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr = q.poll();

            result.add(curr.val);
        }
        return result;
    }

    //created a hashmap of node,parent
    void markParent(TreeNode root, HashMap<TreeNode,TreeNode> parentMap){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left != null){
                parentMap.put(curr.left,curr);
                q.offer(curr.left);
            }

            if(curr.right != null){
                parentMap.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
}