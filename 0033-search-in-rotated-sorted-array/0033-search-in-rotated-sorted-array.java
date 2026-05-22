class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==nums[mid]) return mid;
            
            //left half
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target < nums[mid]){
                    end = mid-1;
                }else // target is in right half
                    start =mid+1;
            }
            else {
                if(target>nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else// target is in left half
                    end = mid-1;
            }
        }
        return -1;
    }
}