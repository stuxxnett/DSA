class Solution {
    public int[] separateDigits(int[] nums) {
        int n=0;
        int[] temp = Arrays.copyOf(nums,nums.length);
        for(int i=0; i<nums.length; i++){
            while(temp[i]!=0){
                n++;
                temp[i] /= 10;
            }
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println(n);
        int[] result = new int[n];
        int idx=n-1;
        for(int i=nums.length-1; i>=0; i--){
            while(nums[i]!=0){
                int ld=nums[i]%10;
                result[idx]=ld;
                nums[i]=nums[i]/10;
                idx--;
            }
        }
        return result;
    }
}