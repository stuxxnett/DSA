class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for(int num: costs){
            if(num<=coins){
                coins = coins-num;
                ans++;
            }
        }
        return ans;
    }
}