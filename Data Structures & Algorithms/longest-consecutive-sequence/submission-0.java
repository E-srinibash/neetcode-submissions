class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int maxCount = 0;
        if(nums.length <= 1){
            return nums.length; 
        }
        for(Integer i : nums){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i]-1)){
                int count = 1;
                int temp = nums[i];
                while(mp.containsKey(temp+1)){
                    count++;
                    temp++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
