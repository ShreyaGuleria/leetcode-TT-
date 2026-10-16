//method1
// class Solution {
//     public int strStr(String haystack, String needle) {
        
//         if(haystack.contains(needle)){
//             return haystack.indexOf(needle);
//         }
//         else{
//             return -1;
//         }
//     }
// }

//method2
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0; i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
