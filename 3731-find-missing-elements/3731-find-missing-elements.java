class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        for(int i = min; i<=max; i++){
            list.add(i);
        }
        for(int num: nums){
            list.remove(Integer.valueOf(num));
        }
        return list;
    }
}