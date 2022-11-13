class Solution {
    public String reverseWords(String s) {
        String res="";
        String afterTrim= s.trim();
        String[] split=afterTrim.split(" +");
        StringBuilder sb= new StringBuilder();
        for(int i=split.length-1;i>=0;i--){
            sb.append(split[i]+" ");
        }
        return sb.toString().trim();
    }
}
