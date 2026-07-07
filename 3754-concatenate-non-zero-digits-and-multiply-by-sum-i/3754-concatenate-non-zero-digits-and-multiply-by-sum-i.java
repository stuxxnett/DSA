class Solution {
    public long sumAndMultiply(int n) {
        int num = n;
        long ans = 0;
        long sum = 0;
        
        while(num != 0){
            
            int lastdigit = num%10;
            sum += lastdigit;
            
            if(lastdigit == 0){
                num = num/10;
                
            }else{
                ans = ans*10 +lastdigit;
                num = num/10;
                
            }
            
        }
        long rev = 0;
        while( ans != 0){
            int ld = (int)ans%10;
            rev = rev*10 + ld;
            ans=ans/10;
        }
        return rev*sum;
    }
}