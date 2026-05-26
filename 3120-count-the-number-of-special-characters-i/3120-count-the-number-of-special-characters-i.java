class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        int ans=0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[ch-'a']++;
            }else{
                upper[ch-'A']++;
            }
        }
        for(int i=0;i<26; i++){
            if(lower[i]>0 && upper[i]>0) ans++;
        }
        return ans;
    }
}