// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length()!=goal.length()){
//             return false;
//         }

//         return (s+s).contains(goal);

//     }
// }

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        Queue <Character> q = new LinkedList<>();
        for(char ch : s.toCharArray()){
            q.add(ch);
        }
        for(int i = 0; i<s.length(); i++){
            char ch = q.poll();
            q.add(ch);

            StringBuilder sb = new StringBuilder();
            for(char a : q){
                sb.append(a);
            }

            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}