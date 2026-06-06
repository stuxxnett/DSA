class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        int n=strs.length;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            List<String> curr = new ArrayList<>();
            for(int j=i; j<n; j++){
                if(isAnagram(strs[i],strs[j]) ){
                    if(!visited[j]){
                        curr.add(strs[j]);
                        visited[j] = true;
                    }
                    
                }
            }
            if(!curr.isEmpty()){
                list.add(curr);
            }
        }
        return list;
    }
    boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        int n=s1.length();
        int[] freq = new int[26];
        for(int i=0; i<n; i++){
            freq[s1.charAt(i) -'a']++;
            freq[s2.charAt(i) -'a']--;
        }

        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}