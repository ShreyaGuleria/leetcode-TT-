class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            char ch = chars[i];
            int count = 0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1)
                sb.append(count);
        }
        for(int j = 0; j<sb.length(); j++){
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}