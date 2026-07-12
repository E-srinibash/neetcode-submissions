class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                Character c = st.peek();
                if((c == '(' && ch == ')') || (c == '{' && ch == '}') || (c == '[' && ch == ']') ){
                    st.pop();
                }
                else{
                    break;
                }
            }
        }
        return st.isEmpty();
    }
}
