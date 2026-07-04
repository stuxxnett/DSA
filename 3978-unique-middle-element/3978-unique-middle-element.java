class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid = n/2;
        int me = nums[mid];
        for(int i=0; i<n; i++){
            if(i==mid) continue;
            if(nums[i]==me) return false;
        }
        return true;
    }
}