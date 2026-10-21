class Solution {
    public int countNegatives(int[][] arr) {
        int m=arr.length-1;
        int n=arr[0].length;
        int i=m;
        int j=0;
        int count=0;
        while(i>=0 && j<n){
            if(arr[i][j]<0){
                count+=n-j;
                i--;
            }
            else{
                j++;
            }
        }
        return count;
    }
}