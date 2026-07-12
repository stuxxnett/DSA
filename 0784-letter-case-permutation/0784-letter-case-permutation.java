class Solution {
    List<String> list;
    public List<String> letterCasePermutation(String s) {
        list = new ArrayList<>();
        solve(s,"");
        return list;
    }
    void solve(String ip, String op){
        if(ip.length() == 0){
            list.add(op);
            return;
        }
        char ch = ip.charAt(0);
        if(Character.isLetter(ch)){
            String op1 = op;
            String op2 = op;
            op1 = op1 + Character.toUpperCase(ch);
            op2= op2 + Character.toLowerCase(ch);
            ip = ip.substring(1);
            solve(ip, op1);
            solve(ip, op2);
        }else{
            solve(ip.substring(1),op+ch);
        }

    }
}