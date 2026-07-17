class Solution {
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                boolean[][] visited = new boolean[n][m];
                boolean[] ocean = new boolean[2]; // ocean[0]=Pacific, ocean[1]=Atlantic

                dfs(heights, i, j, visited, ocean);

                if (ocean[0] && ocean[1]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    void dfs(int[][] heights, int i, int j, boolean[][] visited, boolean[] ocean) {

        int n = heights.length;
        int m = heights[0].length;

        visited[i][j] = true;

        if (i == 0 || j == 0)
            ocean[0] = true;

        if (i == n - 1 || j == m - 1)
            ocean[1] = true;

        if (ocean[0] && ocean[1])
            return;

        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];

            if (ni < 0 || nj < 0 || ni >= n || nj >= m)
                continue;

            if (visited[ni][nj])
                continue;

            if (heights[ni][nj] > heights[i][j])
                continue;

            dfs(heights, ni, nj, visited, ocean);
        }
    }
}