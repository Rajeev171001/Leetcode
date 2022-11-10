class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i,i+2);
                i=i==0?i-1:i-2;
            }
        }
        return sb.toString();
    }
           
    
}
