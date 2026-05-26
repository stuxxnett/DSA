class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(curr,candidates,target,0,0);
        return list;
    }
    void solve(List<Integer> curr,int[] candidates,int target,int i,int sum){
        if(i>=candidates.length) return;

        if(sum>target) return;

        if(sum==target){
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(candidates[i]);
        solve(curr,candidates,target,i,sum+candidates[i]);
        curr.remove(curr.size()-1);
        solve(curr,candidates,target,i+1,sum);
    }
}