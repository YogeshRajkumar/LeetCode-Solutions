class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);

        double res = 1.0;
        long pow = Math.abs((long) n);
        while (pow > 0) {
            if (pow % 2 == 1) {
                res *= x;
            }
            x *= x;
            pow /= 2;
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