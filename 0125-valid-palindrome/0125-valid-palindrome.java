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