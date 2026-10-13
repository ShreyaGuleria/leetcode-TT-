//HashMap Solution
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int num: nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//             if(map.get(num)>nums.length/2){
//                 return num;
//             }
//         }
        
//     }
// }

//Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int x: nums){
            if(count == 0){
                candidate = x;
            }
            if(x==candidate){
                count++;
            }

            else{
                count--;
            }
        
        }
        count = 0;
        for(int num: nums){
            if(num==candidate){
                count++;
            }
        }

        if(count>nums.length/2){
            return candidate;
        }

        return -1;

        
    }
}