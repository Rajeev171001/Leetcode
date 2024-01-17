class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.sort(nums);
        
        int alice=1;
        int bob=0; // for inserting in arr
            for(int i=1;i<nums.length;i+=2){
                arr[bob]=nums[i];
                bob+=2;
            }
        for(int i=0;i<nums.length;i+=2){
            arr[alice]=nums[i];
            alice+=2;
        }
        return arr;
    }
}