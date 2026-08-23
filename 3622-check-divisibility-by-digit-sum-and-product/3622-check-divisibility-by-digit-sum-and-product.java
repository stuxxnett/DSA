class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int product = 1;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            digitSum += rem;
            product *= rem;
            temp = temp/10;
        }
        int sum = digitSum + product;
        return n%sum == 0;
    }
}