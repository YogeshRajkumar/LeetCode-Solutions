class Solution {
    public int countPrimeSetBits(int l, int r) {
        int count=0;
        for(int i=l;i<=r;i++){
            if(isPrime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}