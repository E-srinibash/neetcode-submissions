class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap<>();
        for(String str : strs){
            String sortedStr = str.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining());
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
