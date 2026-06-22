class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            freq[ch-'a']++;
        }
        if(freq[1]==0) return 0;
        String word = "balloon";
        int count = Integer.MAX_VALUE;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch=='l' || ch=='o'){
                count = Math.min(count,freq[ch-'a']/2);
            }else{
                count = Math.min(count,freq[ch-'a']);
            }
        }
        return count;
        
    }
}