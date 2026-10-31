class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);

        long pow = Math.abs((long) n);
        double res = 1.0;
        double base = x;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                res *= base;
            }
            base *= base;
            pow >>= 1;
        }
        return n < 0 ? 1.0 / res : res;

        // double res=1;
        // if(n<0){
        //     x=1/x;
        //     n=-n;
        // }
        // for(int i=0;i<n;i++){
        //     res*=x;
        // }
        // return res;
    }
}