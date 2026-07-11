class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis = new boolean[n];
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                if(bfs(i, adj, vis)){
                    ans++;
                } 
            }
        }
        return ans;
    }

    boolean bfs(int src,List<List<Integer>> adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[src] = true;
        q.offer(src);
        int n = 1;
        int e = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            e += adj.get(curr).size();
            

            for(int nei: adj.get(curr)){
                if( !vis[nei]){
                    q.offer(nei);
                    vis[nei] = true;
                    n++;
                    
                }
            }
        }

        e /= 2;
        if(e == n*(n-1)/2) return true;
        return false;
    }
}