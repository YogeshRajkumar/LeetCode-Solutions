class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            int r=arr.length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}