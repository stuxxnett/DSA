class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int num: nums){
            max=Math.max(num,max);
        }
        int[] freq = new int[max+1];
        if(n!=max+1) return false;
        
        for(int num:nums){
            freq[num]++;
        }
        freq[max]--;
        for(int i=0; i<freq.length; i++){
            freq[i]--;
        }
        for(int num:nums){
            if(freq[num] != 0) return false;
        }
        return true;

    }
}