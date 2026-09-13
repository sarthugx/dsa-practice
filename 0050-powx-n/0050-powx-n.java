class Solution {
    public double myPow(double x, int n) {
        // if(n<0){
        //     n=n*-1;
        //     x=1/x;
        // }
        
        // double result =1;
        // while(n!=0){
        //     if(n%2!=0){
        //         result = result * x;
        //     }

        //     x= x*x;
        //     n= n/2;
        // }
        // return result;

        //using recursion
        
        //checkling if n is neg or pos
        
        long exponent = n;

        if(exponent < 0) return 1.0/power(x, -exponent);

        return power(x,exponent);
    }

    private double power(double x, long n){
        if(n == 0) return 1;
        if(n == 1) return x;

        if(n % 2 == 0) return power(x*x, n/2);
        
        return x * power(x, n-1);
    }
}