class Solution {
    public int totalWaviness(int num1, int num2) {
        int peak = 0;
        int valley = 0;
        for(int i = num1; i<=num2; i++){
            int num = i;
            String str = Integer.toString(num);
            for(int j = 1; j<str.length()-1; j++){
                if(str.charAt(j)< str.charAt(j-1) && str.charAt(j)<str.charAt(j+1)) valley++;
                else if(str.charAt(j)> str.charAt(j-1) && str.charAt(j)>str.charAt(j+1)){
                    peak++;
                }
            }
        }
        return peak+valley;
    }
}