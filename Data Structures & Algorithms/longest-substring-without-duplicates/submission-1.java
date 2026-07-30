class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> frequency = new HashMap<>();
        int max = 0;
        int j = 0;
        int i = 0;
        while(j<s.length()){
            Character charAtj = s.charAt(j);
            frequency.put(charAtj,frequency.getOrDefault(charAtj,0)+1);
                while(frequency.get(charAtj)>1){
                    char charAti = s.charAt(i);
                    frequency.put(charAti,frequency.getOrDefault(charAti,0)-1);
                    i++;
                }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
