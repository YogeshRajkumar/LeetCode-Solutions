class Solution {
    public boolean isPerfectSquare(int n) {
        long l=1;
        long r=n;
        while(l<=r){
            long mid=(l+r)/2;
            long sqr=mid*mid;
            if(n==sqr){
                return true;
            }
            if(sqr>n){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}