class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        
        for(Integer i:nums1){
            h1.add(i);
        }
        for(Integer i:nums2){
            if(h1.contains(i)){
                h2.add(i);
            }
        }
        int n=h2.size();
        int arr[]=new int[n];
        int index=0;
        for(Integer i:h2){
            arr[index++]=i;
        }
        return arr;
    }
}