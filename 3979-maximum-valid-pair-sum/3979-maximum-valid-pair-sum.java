class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        
        int ans = Integer.MIN_VALUE;
        int iMax = nums[0];
        for(int j=k; j<n; j++){
            iMax = Math.max(iMax,nums[j-k]);
            ans = Math.max(ans,nums[j]+iMax);
        }
        
        return ans;
    }
}