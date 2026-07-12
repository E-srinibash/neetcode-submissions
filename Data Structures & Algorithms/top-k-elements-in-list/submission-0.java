class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = 
            new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));    
        Map<Integer,Integer> mp = new HashMap<>();
        int[] res = new int[k];
        for(Integer i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }  

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
        {
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
}
