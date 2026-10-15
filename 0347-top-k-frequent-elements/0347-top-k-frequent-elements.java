class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(map.get(b),map.get(a))
        );

        for(int x : map.keySet()){
            pq.offer(x);
        }

        int [] ans = new int[k];

        for(int i = 0; i<k ; i++){
            ans[i] = pq.poll();
        }
        return ans;

        
    }
}