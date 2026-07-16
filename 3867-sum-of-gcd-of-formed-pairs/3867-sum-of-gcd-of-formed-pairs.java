class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        int[] prefixGcd = new int[n];
        
        mx[0] = nums[0];
        for(int i =1; i<n; i++){
            mx[i] = Math.max(nums[i],mx[i-1]);
        }
        for(int i=0; i<n; i++){
            prefixGcd[i] = gcd(nums[i],mx[i]);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int l = 0,r = n-1;
        while(l<r){
            sum += gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }
        return sum;


    }
    int gcd(int a,int b){
        return (b==0)? a:gcd(b, a%b);
    }
}