class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2){
            return n;
        }

        // int a=1;
        // int b=2;
        // int c=0;
        // for(int i=2;i<n;i++){
        //     c=a+b;
        //     a=b;
        //     b=c;      
        // }
        // return c;

        int[] res=new int[n];
        res[0]=1;
        res[1]=2;
        for(int i=2;i<n;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[n-1];

        // int[] res=new int[n+1];
        // res[1]=1;
        // res[2]=2;
        // for(int i=3;i<=n;i++){
        //     res[i]=res[i-1]+res[i-2];
        // }
        // return res[n];
    }
}
