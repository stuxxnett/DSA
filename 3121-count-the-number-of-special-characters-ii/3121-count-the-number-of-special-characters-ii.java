class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] firstOccur = new int[26];
        int[] lastOccur = new int[26];
        Arrays.fill(firstOccur,-1);
        Arrays.fill(lastOccur,-1);

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lastOccur[ch-'a']=i;
            }else{
                if(firstOccur[ch-'A']==-1){
                    firstOccur[ch-'A']=i;
                }
            }
        }

        int ans=0;
        
        for(int i=0;i<26; i++){
            if(lastOccur[i]!=-1 && firstOccur[i]!=-1){
                if(lastOccur[i] < firstOccur[i]){
                    ans++;
                }
            }
        }
        return ans;
    }
}