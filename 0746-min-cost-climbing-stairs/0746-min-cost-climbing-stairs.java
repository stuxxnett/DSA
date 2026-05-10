class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;

        int[] dp= new int[n+1];
        int[] dp1= new int[n+1];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        return Math.min(solve(cost,0,dp),solve(cost,1,dp1));
    }
    int solve(int[] cost, int i,int[] dp){
        if(i>=cost.length) return 0;

        if(dp[i] != -1) return dp[i];

        int one =cost[i]+solve(cost,i+1,dp);
        int two = cost[i]+solve(cost,i+2,dp);
        return dp[i]=Math.min(one,two);
    }
}