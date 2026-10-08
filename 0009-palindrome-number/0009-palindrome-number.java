class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }
        else{
            return false;
        }
        
    }
}