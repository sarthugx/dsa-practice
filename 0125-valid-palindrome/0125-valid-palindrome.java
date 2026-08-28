class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return palindrome(0, result);
    }

    private static boolean palindrome (int i, String result){
        if(i >= result.length()/2) return true;

        if(result.charAt(i) != result.charAt((result.length()-1)-i)) return false;

        return palindrome(i+1, result);
    }
}




// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
//         int i = 0;
//         int j = s.length()-1;

//         while(i <= j){
//             if(s.charAt(i) != s.charAt(j)){
//                 return false;
//             }
//             else{
//                 i ++;
//                 j --;
//             }
//         }
//         return true;
//     }
// }