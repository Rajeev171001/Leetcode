class Solution {
    public String toLowerCase(String s) {
        char[] ch=s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            int ascii=(int)ch[i];
            if(ascii>64 && ascii<=90){
                ch[i]=(char)(ascii+32);
            }
        }
        return String.valueOf(ch);
    }
}


