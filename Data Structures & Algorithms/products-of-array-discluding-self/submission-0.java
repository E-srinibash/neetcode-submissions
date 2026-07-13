class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodWithout0 = 1;
        int n = nums.length;
        int count = 0;
        for(int i : nums){
            if(i != 0){
                prodWithout0 *= i;
            }
            else{
                count++;
            }
        }
        for(int i=0;i<n;i++){     
        if(count == 0){
            nums[i] = prodWithout0/nums[i];
        }
        else if(count == 1 && nums[i] == 0){
            nums[i] = prodWithout0;
        }
        else{
            nums[i] = 0;
        }
        }
        return nums;
    }
}  
