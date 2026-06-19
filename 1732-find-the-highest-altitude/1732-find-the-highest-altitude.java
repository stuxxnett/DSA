class Solution {
    public int largestAltitude(int[] gain) {
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for(int num : gain){
            sum += num;
            ans = Math.max(sum,ans);
        }
        if(ans<0) ans=0;
        return ans;
    }
}