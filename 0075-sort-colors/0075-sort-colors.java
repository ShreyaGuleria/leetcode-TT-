class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for(int x: nums){
            if(x==0){
                zeroes++;
            }
            else if(x==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        int i = 0;
        while(zeroes> 0){
            nums[i++] = 0;
            zeroes--;

        }
        while(ones> 0){
            nums[i++] = 1;
            ones--;

        }

        while(twos> 0){
            nums[i++] = 2;
            twos--;

        }
        
    }
}