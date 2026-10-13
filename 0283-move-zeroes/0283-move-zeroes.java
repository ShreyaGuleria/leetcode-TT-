//using arraylist
// class Solution {
//     public void moveZeroes(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int x: nums){
//             if(x!=0){
//                 ans.add(x);
//             }
//         }

//         for(int x: nums){
//             if(x==0){
//                 ans.add(x);
//             }
//         }

//         for(int i = 0; i<nums.length; i++){
//             nums[i] = ans.get(i);
//         }
        
//     }
// }

//optimal solution- no new collection
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int x: nums){
            if(x!=0){
                nums[index] = x;
                index++;
            }
           
        }

        while(index<n){
            nums[index] = 0;
            index++;
        }
        
    }
}