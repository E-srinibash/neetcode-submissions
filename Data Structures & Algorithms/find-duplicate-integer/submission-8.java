class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int absoluteIValue = Math.abs(nums[i]);
            nums[absoluteIValue-1] *= -1;
            if(nums[absoluteIValue-1]>0){
                return absoluteIValue;
            }
        }
        return -1;
    }
    
}
