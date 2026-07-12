class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = 0;
        int i = 0;
        while(i<n){
            if(nums[i] == val){
                i++;
            }
            else{
                nums[j] = nums[i];
                j++;
                i++;
            }
        }
        return j;
    }
}