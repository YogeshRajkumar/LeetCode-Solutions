class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int h=n-mid;
            if(arr[mid]>=h){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return n-l;
    }
}