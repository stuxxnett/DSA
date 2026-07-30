class Solution {
    public int minimumPushes(String word) {
        if(word.length()<9){
            return word.length();
        }
        int n = word.length();
        int ans = 0;
        if(n<=16 && n>8){
            ans +=8;
            int len = n-8;
            ans += len*2;
        }else if(n>16 && n<=24){
            int len = n-16;
            ans += 24;
            ans += len*3;
        }else if(n>24){
            int len = n-24;
            ans += 48;
            ans += len*4;
        }
        return ans;
    }
}