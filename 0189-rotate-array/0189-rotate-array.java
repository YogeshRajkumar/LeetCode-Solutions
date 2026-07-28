class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        Reverse(arr,0,n-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
    }
    public void Reverse(int[] arr,int l,int r){
            while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}