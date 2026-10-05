class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue <Integer> q = new LinkedList();
        for(int student : students){
            q.add(student);
        }

        int i = 0;
        int failed = 0;

        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                failed = 0;
            }

            else{
                int s = q.poll();
                q.add(s);
                failed++;

                    if(failed == q.size()){
                        break;
                    }
            }
        }
        return q.size();
    }
}