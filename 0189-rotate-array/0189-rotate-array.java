class Solution {
    public void rotate(int[] nums, int k) {
        Queue <Integer> q = new LinkedList<>();
        k = k%nums.length;

        for(int x: nums){
            q.add(x); 
        }

        for(int i = 0; i<nums.length-k; i++){
            int x = q.poll();
            q.add(x);
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = q.poll();
        }
        
    }
}