class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp); // Sorts the array in place, returns void
            String sortedStr = new String(temp);
            
            if(mp.containsKey(sortedStr)){
                List<String> val = mp.get(sortedStr);
                val.add(str);
            }
            else{
                mp.putIfAbsent(sortedStr,new ArrayList<>(List.of(str)));
            }
        }
            res.addAll(mp.values());

        return res;
    }
}
