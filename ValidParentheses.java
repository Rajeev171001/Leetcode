class Solution {
    public boolean isValid(String s) {
        Stack stk =new Stack();
        if(s.length()%2!=0){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
            if(!stk.empty() ){
                if(stk.peek().equals('(') && s.charAt(i)==')'){
                    stk.pop();
                }
                else if(stk.peek().equals('{') && s.charAt(i)=='}'){
                    stk.pop();
                }
                else if(stk.peek().equals('[') && s.charAt(i)==']'){
                    stk.pop();
                }
                else{
                    stk.push(s.charAt(i));  
                }
            }
            else{
                  stk.push(s.charAt(i));  
                }
        }
    }
        return stk.empty()? true:false;
    }
}
