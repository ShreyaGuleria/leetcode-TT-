class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for(char ch: password.toCharArray()){
            set.add(ch);
        }
        int points = 0;
        for(char ch: set){
            if(Character.isDigit(ch)){
                points += 3;

            }
            else if(Character.isUpperCase(ch)){
                points += 2;
            }

            else if(Character.isLowerCase(ch)){
                points += 1;
            }
            else if(ch == '!' || ch == '@' || ch==  '#' || ch=='$'){
                points +=5;
            }

            
        }

        
        return points;
    }
}