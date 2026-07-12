class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> paranthesis = new Stack();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                paranthesis.push(result.length());
                result.append(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(!paranthesis.isEmpty()){
                    paranthesis.pop();
                    result.append(s.charAt(i));
                }
            }
            else{
                result.append(s.charAt(i));
            }
        }
        while(!paranthesis.isEmpty()) {
        	result.deleteCharAt(paranthesis.pop());
        }
        return result.toString();
    }
}