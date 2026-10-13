class Solution {
    public int[] productExceptSelf(int[] nums) {
        //zero_count solution
        // int[] ans = new int[nums.length];
        // int product = 1;
        // int zero_count = 0;

        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i]==0){
        //         zero_count++;
        //     }
        //     else{
        //         product *= nums[i];
        //     }
        // }

        // for(int i = 0; i<nums.length; i++){
        //     if(zero_count>1){
        //         ans[i] = 0;
        //     }
            
        //     else if(zero_count == 1){
        //         if(nums[i]==0){
        //             ans[i] = product;
        //         }
        //         else{
        //             ans[i] = 0;
        //         }
        //     }

        //     else{
        //         ans[i] = product/nums[i];
        //     }
        // }
        // return ans;

        //prefix suffix solution

        int [] ans = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i<nums.length; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1; 
        for(int i = nums.length-1; i>=0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}