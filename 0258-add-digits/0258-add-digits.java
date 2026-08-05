class Solution {
    public int addDigits(int n) {
        while(n>9){
            int res=0;
            while(n>0){
                int l=n%10;
                res+=l;
                n/=10;
            }
            n=res;
        }
        return n;
        // if(n==0){
        //     return 0;
        // }
        // if(n%9==0){
        //     return 9;
        // }
        // return n%9;
    }
}