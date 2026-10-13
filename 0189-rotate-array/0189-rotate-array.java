// Queue Method
// class Solution {
//     public void rotate(int[] nums, int k) {
//         Queue <Integer> q = new LinkedList<>();
//         k = k%nums.length;

//         for(int x: nums){
//             q.add(x); 
//         }

//         for(int i = 0; i<nums.length-k; i++){
//             int x = q.poll();
//             q.add(x);
//         }

//         for(int i = 0; i<nums.length; i++){
//             nums[i] = q.poll();
//         }
        
//     }
// }

//Triple reversal
// array - [1,2,3,4,5] , k = 3 Expected Output - [3,4,5,1,2]
//Step1 reverse entire array, Output -- [5,4,3,2,1]
//Step2 reverse first k group, Output -- [3,4,5,2,1]
//step3 reverse remaining k group, Output --[3,4,5,1,2]

class Solution {
    public void rotate(int[]nums,int k){
        
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    void reverse(int[]nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}