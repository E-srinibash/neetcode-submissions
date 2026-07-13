class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int maxCount = 0;
        if(nums.length <= 1){
            return nums.length; 
        }
        for(Integer i : nums){
            st.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i]-1)){
                int count = 1;
                int temp = nums[i];
                while(st.contains(temp+count)){
                    count++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
