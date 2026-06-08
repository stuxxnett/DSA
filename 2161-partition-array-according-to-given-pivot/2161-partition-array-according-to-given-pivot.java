class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                smaller.add(num);
            }else if(num>pivot){
                bigger.add(num);
            }
        }
        for(int num:nums){
            if(num==pivot){
                smaller.add(num);
            }
        }
        smaller.addAll(bigger);
        int[] ans = new int[smaller.size()];
        for(int i = 0; i<smaller.size(); i++){
            ans[i]=smaller.get(i);
        }
        return ans;

    }
}