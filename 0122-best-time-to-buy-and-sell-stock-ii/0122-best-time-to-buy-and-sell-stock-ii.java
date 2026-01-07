class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i = 0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(prices,1,0,dp);
    }
    static int solve(int[] prices,int flag,int i,int[][] dp){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][flag]!=-1){
            return dp[i][flag];
        }
        if(flag==1){
            int buy = -prices[i]+solve(prices,0,i+1,dp);
            int skip = 0+solve(prices,1,i+1,dp);
            return dp[i][flag]=Math.max(buy,skip);
        }else{
            int sell = prices[i]+solve(prices,1,i+1,dp);
            int skip = 0+solve(prices,0,i+1,dp);
            return dp[i][flag]= Math.max(sell,skip);
        }
    }
}