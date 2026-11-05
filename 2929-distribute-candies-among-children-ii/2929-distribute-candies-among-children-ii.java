class Solution {
    public long distributeCandies(int n, int lim) {
        long res=Fn(n+2);
        res-=3*Fn(n-lim+1);
        res+=3*Fn(n-2*lim);
        res-=Fn(n-3*lim-1);
        return res;
    }
    public long Fn(long x){
        if(x<2){
            return 0;
        }
        return x*(x-1)/2;
    }
        // int count=0;
        // for(int i=0;i<=x;i++){
        //     for(int j=0;j<=x;j++){
        //         int res=n-i-j;
        //         if(res>=0 && res<=x){
        //             count++;
        //         }
        //     }
        // }
        // return count;
}