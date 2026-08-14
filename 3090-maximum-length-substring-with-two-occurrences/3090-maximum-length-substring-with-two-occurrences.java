class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int len = 0;
        int l = 0,r=0;
        while(r<n){
            freq[s.charAt(r)-'a']++;
            while(freq[s.charAt(r)-'a'] > 2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            r++;
            len = Math.max(len,r-l);
        }
        return len;

    }
}