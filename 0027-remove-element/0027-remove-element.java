class Solution {
    public int removeElement(int[] nums, int val) {
        int s=0;
        if(nums.length==0) return 0;
            
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[s++]=nums[i];
            }
        }
        return s;
        
    }
}