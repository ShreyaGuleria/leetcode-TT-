// doesnt use constant auxillary space
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List <Integer> ans = new LinkedList<>();
       Set <Integer> set = new HashSet<>();
       for(int x: nums){
        if(set.contains(x)){
            ans.add(x);
        }
        
            set.add(x);
        
        
       }
       return ans;
        
    }
}

//solution with constant auxillary space
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new LinkedList<>();
//         for(int  i = 0; i<nums.length; i++){
//             int index = Math.abs(nums[i])-1;
//             if(nums[index]<0){
//                 ans.add(Math.abs(nums[i]));
//             }
//             else{
//                 nums[index] = -nums[index];
//             }
//         }
//         return ans;
//     }
// }