class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int missingSum = 0;
        for(int i=0;i<nums.length;i++){
            missingSum += nums[i]; 
        }
        return actualSum - missingSum;
    }
}
