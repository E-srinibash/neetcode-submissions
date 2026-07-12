class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(String s: strs){
            int len = s.length();
            encoded_string.append(len);
            encoded_string.append("#");
            encoded_string.append(s); 
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            int end = start + len;
            String subString =  str.substring(start,end);
            decoded_strs.add(subString);
            i = end;
        }
        return decoded_strs;
    }
}
