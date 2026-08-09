class Solution {
    public int diagonalSum(int[][] arr) {
        int n=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            sum+=arr[i][n-1-i];
        }
        if(arr.length%2!=0){
            sum-=arr[n/2][n/2];
        }
        return sum;
        // int m=arr.length;
        // int n=arr[0].length;
        // int sum=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j || i+j==n-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        // return sum;
    }
}