class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        int j;
        int k;
        Arrays.sort(nums);
        
        for(i =0;i<n-2;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            j = i+1;
            k = n-1;

            while(j<k){
                int tempSum = nums[i]+nums[j]+nums[k];
                if(tempSum==0){
                    res.add(List.of(nums[i],nums[j],nums[k]));

                    int currJVal = nums[j];
                    int currKVal = nums[k];
                    while(j<k && nums[j] == currJVal){
                        j++;
                    }    
                    while(j<k && nums[k] == currKVal){
                        k--;
                    }  
                 
                }      
                else if(tempSum < 0){
                    j++;    
                }
                else{
                    k--;   
                }
            }
        }
       return res;
    }
     
    }

