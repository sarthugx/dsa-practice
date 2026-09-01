class Solution {
    public int myAtoi(String s) {
         //1.whitespaces
         s= s.trim();

         if(s.isEmpty()) return 0;


         //2.Sign
         int i = 0;
         int sign = 1;

         if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1:1;
            i++;
         }
        
        //3

        long num = 0;

         while(i<s.length() && Character.isDigit(s.charAt(i))){
            num = (num * 10) + (s.charAt(i) - '0');
            //4
            if(num*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            if(num*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
         }

         return (int) num*sign;
    }
}