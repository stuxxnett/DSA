class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int l = -1;
        int sl = -1;
        for(int i = 0; i<n; i++){
            if(nums[i]>l){
                sl = l;
                l = nums[i];
            }else if(nums[i]>sl){
                sl = nums[i];
            }
        }
        return (l-1)*(sl-1);
    }
}