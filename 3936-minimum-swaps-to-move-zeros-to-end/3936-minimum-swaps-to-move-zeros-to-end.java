class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) count++;
        }
        int j=n-1;
        int ans=0;
        for(int i=0; i<count; i++){
            if(nums[j]!=0){
                ans++;
            }
            j--;
        }
        return ans;
    }
}