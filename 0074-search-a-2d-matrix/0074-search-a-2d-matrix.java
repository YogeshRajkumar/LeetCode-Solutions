class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int mid=(l+r)/2;
            int value=arr[mid/n][mid%n];
            if(target==value){
                return true;
            }
            else if(value<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}