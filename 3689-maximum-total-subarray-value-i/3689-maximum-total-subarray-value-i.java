class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int num:nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return (max-min)*k;
    }

}