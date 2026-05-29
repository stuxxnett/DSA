class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int currSum=sum(nums[i]);
            min=Math.min(min,currSum);
            System.out.print(currSum+" ");
        }
        return min;
    }
    int sum(int num){
        int ans=0;
        while(num!=0){
            int dig=num%10;
            ans +=dig;
            num =num/10;
        }
        return ans;
    }
}