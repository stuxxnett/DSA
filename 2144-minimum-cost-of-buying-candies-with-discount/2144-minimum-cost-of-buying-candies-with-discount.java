class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int totalCost=0;
        int n=cost.length;
        if(n==1) return cost[0];
        if(n==2) return cost[0]+cost[1];
        int i=n-1;
        int cnt=0;
        while(i>=0){
            if(cnt==2){
                i--;
                cnt=0;
                continue;
            }
            totalCost += cost[i];
            cnt++;

            i--;
        }
        return totalCost;
    }
}