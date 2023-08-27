class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int mid=nums.length/2;
        int i=0;
        int j=mid;
        int k=0;
        while(i<mid && j<nums.length){
            arr[k]=nums[i];
            i++;
            k++;
            arr[k]=nums[j];
            j++;
            k++;
        }
        return arr;
        
    }
}
