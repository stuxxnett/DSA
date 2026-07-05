class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            max = Math.max(range(num),max);
        }
        int sum = 0;
        for(int num:nums){
            if(range(num)==max){
                sum += num;
            }
        }
        return sum;
    }
    int range(int num){
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        while(num>0){
            int ld = num%10;
            l = Math.max(ld,l);
            s = Math.min(ld,s);
            num /= 10;
        }
        return l-s;
    }
}