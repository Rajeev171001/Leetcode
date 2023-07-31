class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low + (high-low)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[low]<=nums[mid]){ //means left part is sorted
                if(nums[low]<=target && target<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target<=nums[high] && nums[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return nums[low] == target ? low : -1;
    }
}