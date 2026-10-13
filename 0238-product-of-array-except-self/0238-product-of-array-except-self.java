class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int zero_count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                zero_count++;
            }
            else{
                product *= nums[i];
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(zero_count>1){
                ans[i] = 0;
            }
            
            else if(zero_count == 1){
                if(nums[i]==0){
                    ans[i] = product;
                }
                else{
                    ans[i] = 0;
                }
            }

            else{
                ans[i] = product/nums[i];
            }
        }
        return ans;
    }
}