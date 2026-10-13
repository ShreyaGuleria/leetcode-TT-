class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x: nums){
            if(x!=0){
                ans.add(x);
            }
        }

        for(int x: nums){
            if(x==0){
                ans.add(x);
            }
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = ans.get(i);
        }
        
    }
}