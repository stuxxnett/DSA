class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n*m;
        int[] flat = new int[size];
        int idx =0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                flat[idx]=grid[i][j];
                idx++;
            }
        }
        while(k!=0){
            int last = flat[size-1];
            idx=size-1;
            while(idx>0){
                flat[idx]=flat[idx-1];
                idx--;
            }
            flat[0] = last;
            k--;
        }
        idx=0;

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j<m; j++){
                curr.add(flat[idx]);
                idx++;
            }
            ans.add(curr);
        }
        return ans;
    }
    
}