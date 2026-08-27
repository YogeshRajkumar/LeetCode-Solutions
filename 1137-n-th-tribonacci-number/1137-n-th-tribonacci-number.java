class Solution {
    public int tribonacci(int n) {
        // if(n==0 || n==1){
        //     return n;
        // }
        // if(n==2){
        //     return 1;
        // }
        // int[] arr=new int[n+1];
        // arr[0]=0;
        // arr[1]=1;
        // arr[2]=1;
        // for(int i=3;i<=n;i++){
        //     arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        // }
        // return arr[n];

        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        int a=0;
        int b=1;
        int c=1;
        for(int i=3;i<=n;i++){
            int sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return c;
    }
}